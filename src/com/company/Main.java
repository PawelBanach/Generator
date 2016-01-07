package com.company;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random r = new Random();
    static String[] Countries = {"Polska", "Niemcy", "Stany Zjednoczone", "Francja", "Włochy", "Hiszpania", "Czechy",
            "Austria", "Kanada", "Chiny", "Rosja", "Brazylia", "Argentyna", "Anglia", "Szwecja", "Norwegia",
            "Portugalia"};
    static String[] FirstNames = {"Antoni", "Jan", "Jakub", "Franciszek", "Aleksander", "Adam", "Filip", "Szymon",
            "Mateusz",
            "Michał", "Kacper", "Mikołaj", "Bartek", "Stanisław", "Piotr", "Wojciech", "Wiktor", "Ignacy", "Leon",
            "Tymon", "Julian", "Maksymilian", "Krzysztof", "Maciej", "Marcel", "Dawid", "Karol", "Miłosz",
            "Igor", "Oskar", "Kajetan", "Tomasz", "Alan", "Tymoteusz", "Dominik", "Ksawery", "Oliwier", "Patryk",
            "Sebastian", "Nikodem", "Adrian", "Kamil", "Natan", "Stefan", "Bruno", "Gustaw", "Hubert", "Jerzy",
            "Gabriel",
            "Krystian", "Kinga", "Kalina", "Anastazja", "Urszula", "Sara", "Izabela", "Agata", "Marta", "Milena",
            "Magdalena", "Ewa", "Aniela", "Nela", "Katarzyna", "Malgorzata", "Nikola", "Kaja", "Jagoda", "Kornelia",
            "Karolina", "Joanna", "Blanka", "Marcelina", "Nina", "Michalina", "Łucja", "Iga", "Emilia", "Anna",
            "Weronika",
            "Laura", "Barbara", "Gabriela", "Antonina", "Pola", "Liliana", "Lena", "Wiktoria", "Oliwia",
            "Helena", "Hanna", "Maria", "Aleksandra", "Natalia", "Amelia", "Maja", "Julia", "Alicja", "Zuzanna",
            "Zofia", "Marcin", "Marek", "Olaf", "Paweł", "Tadeusz", "Grzegorz", "Ryszard",
            "Eryk", "Jacek", "iwo", "Andrzej", "Artur", "Borys", "Konstanty", "Robert", "Witold", "Damian",
            "Daniel",
            "Juliusz", "Łukasz", "Martyna", "Marianna", "Marika", "Matylda", "Nadia", "Patrycja", "Ada",
            "Dominika", "Klara",
            "Paulina", "Róża", "Janina", "Krystyna", "Liwia", "Malwina", "Olga", "Rozalia", "Adrianna", "Agnieszka",
            "Aurelia"};//140 imion
    static String[] LastNames = {"Chrzanowski", "Bukowski", "Leśniak", "Cieślik", "Kosiński", "Jędrzejewski",
            "Muszyński",
            "Świątek", "Kozieł", "Osiński", "Czaja", "Lisowski", "Kuczyński", "Żukowski", "Grzybowski", "Kwiecień",
            "Pluta", "Morawski", "Czyż", "Sobczyk", "Augustyniak", "Rybak", "Krzemiński", "Marzec", "Konieczny",
            "Marczak", "Zych", "Michalik", "Michałowski", "Kaczor", "Świderski", "Kubicki", "Gołębiowski", "Paluch",
            "Białek", "Niemiec", "Sroka", "Stefaniak", "Cybulski", "Kacprzak", "Marszałek", "Kasprzyk", "Małek",
            "Szydłowski", "Smoliński", "Kujawa", "Lewicki", "Przybysz", "Stachowiak", "Popławski", "Piekarski",
            "Matysiak",
            "Janowski", "Murawski", "Cichocki", "Witek", "Niewiadomski", "Staniszewski", "Bednarz", "Lech", "Rudnicki",
            "Kulesza", "Piątkowski", "Turek", "Chmiel", "Biernacki", "Sowiński", "Skrzypczak", "Podgórski", "Cichoń",
            "Rosiński", "Karczewski", "Żurek", "Drozd", "Żurawski", "Pietrzyk", "Komorowski", "Antczak", "Gołębiewski",
            "Góra", "Banach", "Filipiak", "Grochowski", "Krzyżanowski", "Graczyk", "Przybyła", "Gruszka", "Banaś",
            "Klimczak", "Siwek", "Konieczna", "Serafin", "Bieniek", "Godlewski", "Rak", "Kulik", "Maćkowiak", "Zawada",
            "Mikołajczak", "Różański", "Cieśla", "Długosz", "Śliwa", "Ptak", "Strzelecki", "Zarzycki", " " +
            "Mielczarek", "Kłos", "Bartkowiak", "Leśniewski", "Krawiec", "Górka", "Janiak", "Kaczyński", "Bartczak",
            "Winiarski",
            "Tokarski", "Gil", "Panek", "Konopka", "Frankowski", "Banasiak", "GrzybRakowski", "Kuś", "Dudziński",
            "Zaremba",
            "Skowron", "Fijałkowski", "Dobosz", "Witczak", "Nawrot", "Królikowski", "Młynarczyk", "Sienkiewicz",
            "Frączek", "Słowik",
            "Frąckowiak", "Czyżewski", "Kostrzewa", "Kucharczyk", "Gawroński", "Rybicki", "Pałka", "Biernat",
            "Różycki", "Bogusz",
            "Rogalski", "Szymczyk", "Janus", "Szczepanik", "Szczygieł", "Buczek", "Szostak", "Kaleta", "Kaczorowski",
            "Żebrowski", "Tkaczyk", "Grzegorczyk", "Drzewiecki", "Trojanowski", "Bagiński", "Książek", " Jurek",
            "Trzciński",
            "Gawron", "Wojtczak", "Rogala", "Kula", "Kubik", "Maliszewski", "Radomski", "Dąbek", "Kisiel", "Cebula",
            "Rosiak", "Zaręba", "Gąsior", "Grzesiak", "Gawlik", "Cygan", "Rojek", "Dębowski", "Bogucki", "Więckowski",
            "Mikulski", "Walkowiak", "Malec", "Burzyński", "Flis", "Wąsik", "Czapla", "Drozdowski", "Kwaśniewski",
            "Wójcicki", "Rzepka", "Gałązka", "Łukasiewicz", "Pawelec", "Lipsk", "Wnuk", "Kołodziejski"};
    //200 nazwisk
    static char[] MiddleInitials = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
            'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
    static String[] ZipCodes = {"YCXKA", "747R3", "826AU", "UZ5YH", "9HJDC", "4FTG7", "M79AH", "A8C8P", "56G27",
            "2LWVA", "5VHEY", "L965G", "3HD3J", "M3GPZ", "VKV4B", "TUNGG", "PC3XG", "R9GN5", "NFCS8", "L5ZSK",
            "REUD9", "WWTA4", "2P6TD", "DBCLP", "8YVAG", "TMBK6", "L2B76", "ATSUU", "MLAJ6",
            "DN7GY", "MEN8E", "USSW3", "N9UQ6", "QQQ9B", "BMMBV", "HE9FL", "XSRCQ", "VX8EK", "2SJM9", "F4PW3",
            "QXE4Z", "2C52H", "GP2YS", "GLFFQ", "Q89ZK", "87DNT", "75HCX", "84Z4U", "9BAZZ",
            "S8BXE", "SECR6", "MP3R4", "MNXVR", "LTLCN", "6CP74", "FQ3HD", "7ZJAG", "ENW85", "QKJD6", "ZQQBS",
            "48VJ6", "PQLGX", "QENYE", "V5SH3", "NYCW4", "9NJQQ", "3JPNT", "K49VA", "WCEB3",
            "JWW36", "PFVS4", "PSGY8", "XRHC6", "2NY2A", "YPC5Q", "5EDR7", "A7DVQ", "7B8EZ", "64GD6", "D6K3W",
            "KSBNM", "SHRWZ", "PWWTJ", "CRKBV", "B7QJB", "MM7WE", "U7WVL", "9ETR2", "K7P8R",
            "YB89C", "UAAAK", "BMW99", "2T7NF", "HNK36", "CC4SA", "KGBHF", "D3GE4", "RFFDE", "E6YCK", "5KYFC"};
    static String[] Cities = {"Warszaw", "Kraków", "Łódź", "Wrocław", "Poznać", "Gdańsk", "Szczecin", "Bydgoszcz",
            "Lublin",
            "Katowice", "Białystok", "Gdynia", "Częstochowa", "Radom", "Sosnowiec", "Toruń", "Kielce", "Rzeszów",
            "Gliwice", "Zabrze", "Olsztyn", "Bielsko-Biała", "Bytom", "Ruda Sląska", "Rybnik", "Zielona Góra",
            "Tychy",
            "Gorzów Wielkopolski", "Dąbrowa Górnicza", "Elbląg", "Płock", "Opole", "Wałbrzych", "Włocławek",
            "Tarnów",
            "Chorzów", "Koszalin", "Kalisz", "Legnica", "Grudziądz", "Jaworzno", "Słupsk", "Jastrzebie-Zdrój",
            "Nowy " +
                    "Sącz", "Jelenia Góra", "Siedlce", "Konin", "Piotrków Trybunalski", "Mysłowice", "Inowrocław"};
    static String[] Streets = {"Andersena Hansa Chrystiana", " Antoniny", "Antonińska", "Aksamitna", "Alojzego",
            "Arabska", "Anny Jagiellonki", "Bema", "Będzińska", "Bielska", "Błotna", "Bolesławów", "Browarna",
            "Budziszyńska", "Chromowa", "Chocimska", "Chałubińskiego", "Czcibora", "Czackiego", "Czorsztyńska",
            "Czeremoska ", "Deotymy", "Dodatnia", "Ekonomiczna", "Eugeniusza", "Familijna ", "Finansowa ",
            "Florecistów", "Franciszkańska", "Galla Anonima", "Gospodarcza", "Henryka Brodatego ", "Janowskiego " +
            "", "Juhasowa", "Karpacka ", "Kaszyńskiego ", "Kędry", "Klimatyczna ", "Kolejowa", "Kominowa",
            "Komfortowa ", "Konarowa", "Koprowa", "Laskowicka", "Magnesowa ", "Notecka", "Objazdowa",
            "Olechowska", "Ozorkowska", "Oświęcimska", "Ostrołęcka"};
    static String[] CompanyNames = {"KAMOBILE", "AIMOBILE", "BAMOBILE", "AXMOBILE", "CAMOBILE", "GAMOBILE", "PTAMED",
            "TAXMED", "AZAMED", "CAVMED", "CAMMED", "BQAMED", "TAAMED", "ACAMED", "NAWMED", "CAPMED", "HMAMED",
            "IYSNET",
            "GKYNET", "BJYNET", "CYXNET", "KYKNET", "XPYNET", "YAONET", "CYWNET", "OYDNET", "LIDFARM", "DISFARM",
            "IQXFARM",
            "IDIFARM", "ITOFARMMAL", "KAVTECH", "NSATECH", "ATBTECH", "GBATECH", "EKATECH", "MACTECH", "COMARCH", "TVN",
            "TVP", "MBANK", "INGBANK", "PZU", "PKO", "NC+", "CYFROWY POLSAT", "ALLEGRO", "SABRE", "ONET", "INTERIA",
            "ALIORBANK", "ERICPOL", "GOOGLE", "FACEBOOK", "MICROSOFT", "ERICSON", "GOCLEVER"};
    static String[] ContactTitles = {"CEO", "Chief Operating Officer", "Software Engineer", "Senior Engineering",
            "Customer Service", "Receptionist"};
    static String[] ConferenceNames = {"Asymptotic invariants attached to linear series", "Varieties with trivial " +
            "canonical bundles", "Polish Algebraic GEometry mini-Semester", "Conference — Foliations", "Third " +
            "International Conference on Artificial Intelligence", "Third International Conference on Pattern Recognition", "2nd Symposium of the Division for " +
            "Physics", "International Conference on Computational Heat and Mass Transfer", "20 International Krutyn " +
            "Summer School", "45th School & Conference on the Physics", "14th International Workshop on Meson " +
            "Production", "21th International Krutyn Summer School 2016", "International Conference on Microwave, " +
            "Radar and Wireless Communications", "Microwave and Radar Week", "IRS — International Radar Symposium",
            "5th Workshop on Progress in Trace Metal Speciation", " 23rd International Science Conference on Computer" +
            " Networks", "International Conference on Security and Performances In Complex Infrastructures and Emerging Systems", "8th European " +
            "Postgraduate Fluid Dynamics Conference", "10th International Conference on Compatibility, Power " +
            "Electronics and Power Engineering", "CRACOW LANDSCAPE CONFERENCE", "5th EAAP International Symposium on " +
            "Energy and Protein Metabolism and Nutrition", "EMBO Conference — Imaging the brain", " IMICF — Investing" +
            " in Medical Innovations Congress & Fair", " McMaster International Review Course in Internal Medicine",
            "The Revolution in Psychotherapy. New ideas, research and practise.",
            "Scientific Society of Psychodynamic Psychotherapy", "American Astronomical Society Meeting", "Dynamics " +
            "and accretion at the Galactic Center", "The Reionization Epoch: New Insights and Future Prospects",
            "Python in Astronomy", "From Stars to Massive Stars", " ICS Security Summit & Training 2016",
            "International Conference on Verification, Model Checking, and Abstract Interpretation", "Symposium on " +
            "Principles of Programming Languages", "DeveloperWeek", " 2016 Data Compression Conference", " 2016 IEEE " +
            "International Conference on Software Testing, Verification and Validation", "SEI Architecture Technology" +
            " User Network (SATURN) 2016", "38th International Conference on Software Engineering", "International " +
            "Conference on Mobile Software Engineering and Systems", " International Symposium on Software " +
            "Engineering for Adaptive and Self-Managing Systems", " International Conference on Electro Information " +
            "Technology", "Symposium on Parallelism in Algorithms and Architectures", "SIGDIAL Annual Meeting", "High" +
            " Performance Extreme Computing Conference", "International Symposium on the Foundations of Software " +
            "Engineering", "Geotechnical and Structural Engineering Congress", " WTC — World Tunnel Congress", "CSS16" +
            " — Modeling, Simulation & Crash Safety Congress"};
    static String Description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse dignissim " +
            "volutpat enim in malesuada. Nulla sed enim libero. Etiam elementum.";
    static String[] DurationTimes = {"01:00:00", "01:30:00", "02:00:00", "02:30:00", "03:00:00", "03:30:00",
            "04:00:00"};
    static String[] Workshops = {"JavaWorkshop", "CWorkshop", "C++Workshop", "C#Workshop", "PythonWorkshop",
            "PHPWorkshop", "VisualBasic.NETWorkshop", "JavaScriptWorkshop", "AssemblyWorkshop",
            "RubyWorkshop", "PerlWorkshop", "PascalWorkshop", "VisualBasicWorkshop", "SwiftWorkshop",
            "MATLABWorkshop", "DelphiWorkshop", "GroovyWorkshop", "Objective-CWorkshop", "RWorkshop",
            "PL/SQlWorkshop", "Competition", "Advanced Writing Skills-I", "Advanced Writing Skills-II", "Building " +
            "Relationships for Success in Sales - I", "Building Relationships for Success in Sales - II" +
            "Business Ethics for the Office - II", "Business Etiquette - I", "Business Etiquette - II", "Competition " +
            "- II", "Business Writing that Works - I", "Business Writing that Works - II", "Landscape Photography",
            "Conflict Resolution - Dealing With Difficult People - I", "Core Negotiation Skills - II", "Entrepreneurship 101 - I",
            "Entrepreneurship 101 - II", "Value of a Customer - I", "Develop a Full iPhone Application", "Build a " +
            "Mobile Responsive Web Application", "Logistics and Supply Chain Management - I",
            "Logistics and Supply Chain Management - II", "Value of a Customer - II", "Stress Relief and Stress " +
            "Reduction -I", "Stress Relief and Stress Reduction -II", "The ABCs of Supervising Others - I", "The ABCs" +
            " of" + " Supervising Others -II", "Train-the-Trainer - Inspire, Motivate, and Educate - II", "Develop a " +
            "Full iPad Application", "Build a Single Page Web Application", "Build a Rich Internet Application", "Employer and " +
            "Employee animosity", "Increase Your Employability Score"};
    static String[][][] InformationsAboutWorkshops = new String[ConferenceNames.length][][];
    static String[] StartTimes = {"7:00:00", "7:30:00", "8:00:00", "8:30:00", "9:00:00", "9:30:00", "10:00:00",
            "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00",
            "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00",
            "19:30:00", "20:00:00", "20:30:00", "21:00:00"};
    static int IndividualClientslength = 600; //klienci
    static int [][] InformationsAboutConferenceReservation = new int [2000][5];  //idreservatio, conference, client,
    // start reservation day, end reservation day
    static int [][] InformationsAboutConferenceStartDate = new int [ConferenceNames.length][3]; //year //month
    // reser //participants limit
    static int IDConferenceDayParticipant;
    static int IDConferenceDayReservation;
    static int IDWorkshopReservation;
    //static String valueConferenceDay="";
    //static String valueWorkshop="";
    //static String valueCDParticipant="";
    //static String valueWParticipant=""; //Już niepotrzebne
    static List<Integer> participantsid = new ArrayList<Integer>();

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter zapis = new PrintWriter("generator.txt");
        String WorkshopName;
        for (int i = 0; i < IndividualClientslength; i++) zapis.println(createIndividualClients());
        for (int i = 0; i < CompanyNames.length; i++) zapis.println(createCompanyCLients(i));
        for (int i = 0; i < ConferenceNames.length; i++) zapis.println(createConferenceswithThresholds(i));
        for (int i = 0; i < Workshops.length; i++) zapis.println(createWorkshops(i));
        //Information workshops to tablica 3-wymiarowa gdzie 1 wymiar to współrzędna konferencji,
        //drugi wymiar do liczba dni danej konferencji, a trzeci wymiar to liczba workshopów w danym dniu konferencji
        for (int i = 0; i < InformationsAboutWorkshops.length; i++) //Information About Conference -> ConferenceID
        {
            for (int j = 0; j < InformationsAboutWorkshops[i].length; j++) //Information About Conference Day
            {
                for (int k = 0; k < InformationsAboutWorkshops[i][j].length; k++) //Information About Workshop in Day
                {
                    WorkshopName = Workshops[r.nextInt(Workshops.length)];
                    for(int l = 0; l < k; l++)
                    {
                        while(InformationsAboutWorkshops[i][j][l].equals(WorkshopName))
                        {
                            WorkshopName = Workshops[r.nextInt(Workshops.length)];
                            l=0;
                        }
                    }
                    InformationsAboutWorkshops[i][j][k] = WorkshopName;
                    zapis.println(createWorkshopEvents(WorkshopName, i, j));
                }
            }
        }
        int Clientslength = CompanyNames.length + IndividualClientslength;
        IDWorkshopReservation=IDConferenceDayReservation=IDConferenceDayParticipant = 0;
        for( int i = 0; i < 1000; i++) //Reservation id
        {
            InformationsAboutConferenceReservation[i][0] = i+1;
            InformationsAboutConferenceReservation[i][1] = r.nextInt(ConferenceNames.length); //Konferencja
            InformationsAboutConferenceReservation[i][2] = r.nextInt(Clientslength);           //Klient
            InformationsAboutConferenceReservation[i][3] = 0; //było losowanko ale już nie ma
            InformationsAboutConferenceReservation[i][4] =InformationsAboutWorkshops[InformationsAboutConferenceReservation[i][1]].length;
             //[i][3] -> początek dni konferencji [i][4] -> koniec dni, zmieniając te wartości możemy decydować w
             // które dni konferencji się zapiszemy
            zapis.println(createConferenceReservations(InformationsAboutConferenceReservation[i][1],
                    InformationsAboutConferenceReservation[i][2],InformationsAboutConferenceReservation[i][3],
                    InformationsAboutConferenceReservation[i][4], i+1));


        }
        //zapis.println(valueConferenceDay);
        //zapis.println(valueWorkshop);
        //zapis.println(valueCDParticipant);
        //zapis.println(valueWParticipant);
        zapis.close();
       System.out.println("Wygenerowano baze");
    }

    private static String createConferenceReservations(int conference, int client, int start, int end, int
            idreservation) {
        String conferencename, clientID, reservationdate, paid, value, reservedtickets, workshopname, firstname,
                lastname,indeks;
        int year, month, day, conftickets, worktickets,index, idworkshopparticipant,firstidworkshopparticipant;
        conferencename = ConferenceNames[conference];
        clientID = Integer.toString(client+1);
        year = InformationsAboutConferenceStartDate[conference][0];
        month = InformationsAboutConferenceStartDate[conference][1]-1;
        //limit = InformationsAboutConferenceStartDate[conference][2];
        if(month == 0)
        {
            year--;
            month = 12;
        }
        day = r.nextInt(26) + 1;
        reservationdate = Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);
        if(idreservation%7==0) paid = Integer.toString(0);
        else paid = Integer.toString(1); //co 7 nie zapłacił
        value = "execute [dbo].[AddReservationToConferenceByClientID] '" + conferencename + "'," + clientID + ",'" +
                reservationdate + "'," + paid;

        for(int i=start; i<end; i++)
        {
            conftickets = r.nextInt(8)+1;
            reservedtickets = Integer.toString(conftickets);
            //valueConferenceDay = valueConferenceDay + "\nexecute [dbo].[AddDayReservation] "+idreservation+"," +
            //    ""+Integer.toString(i+1)+"," +
            //    ""+reservedtickets;
            value = value + "\nexecute [dbo].[AddDayReservation] "+idreservation+"," +
                    ""+Integer.toString(i+1)+"," +
                    ""+reservedtickets;
            IDConferenceDayReservation++;
            firstidworkshopparticipant = IDConferenceDayParticipant+1;
            for(int k = 0; k<conftickets; k++)
            {
                firstname = FirstNames[r.nextInt(FirstNames.length)];
                lastname = LastNames[r.nextInt(LastNames.length)];
                if(k%3 == 0) //Co trzeci to student
                {
                    index = r.nextInt(900000)+100000;
                    indeks = Integer.toString(index);
                  //  valueCDParticipant = valueCDParticipant + "\nexecute [dbo].[AddStudentConferenceParticipant] " +
                  //         ""+IDConferenceDayReservation+",'"+firstname+"','"+lastname+"','"+indeks+"'";
                    value = value + "\nexecute [dbo].[AddStudentConferenceParticipant] " +
                            ""+IDConferenceDayReservation+",'"+firstname+"','"+lastname+"','"+indeks+"'";
                }
                else
                {
                    //valueCDParticipant = valueCDParticipant + "\nexecute [dbo].[AddConferenceParticipant] " +
                     //       ""+IDConferenceDayReservation+",'"+firstname+"','"+lastname+"'";
                    value = value + "\nexecute [dbo].[AddConferenceParticipant] " +
                            ""+IDConferenceDayReservation+",'"+firstname+"','"+lastname+"'";
                }

                IDConferenceDayParticipant++;
            }
            for(int j=0; j<InformationsAboutWorkshops[conference][i].length; j++) //dla każdego dnia rezerwacji
            // wylosuj
            // wszystkie możliwe workshopy
            {
                //idreservation,workshopname,daynumber,reservedtickets
                workshopname = InformationsAboutWorkshops[conference][i][j]; //
                worktickets = conftickets-r.nextInt(5);
                if(worktickets<=0) worktickets=1;
                reservedtickets = Integer.toString(worktickets);
                //valueWorkshop = valueWorkshop + "\nexecute [dbo].[AddWorkshopReservation] "+idreservation+"," +
                //        "'"+workshopname+"'," +
                //        ""+Integer.toString(i+1)+"," +
                //        ""+reservedtickets;
                value = value + "\nexecute [dbo].[AddWorkshopReservation] "+idreservation+"," +
                        "'"+workshopname+"'," +
                        ""+Integer.toString(i+1)+"," +
                        ""+reservedtickets;
                IDWorkshopReservation++;
                for(int l=0; l<worktickets; l++)
                {
                    //nie można dodać tego samego uczestnika na tą samą konferencje
                    idworkshopparticipant =firstidworkshopparticipant+r.nextInt(conftickets);
                    for(int k=0; k<l; k++)
                    {
                        while(participantsid.get(k) == idworkshopparticipant)
                        {
                            idworkshopparticipant =firstidworkshopparticipant+r.nextInt(conftickets);
                            k=0;
                        }
                    }
                    participantsid.add(idworkshopparticipant);
                    //valueWParticipant = valueWParticipant + "\nexecute [dbo].[AddWorkshopParticipant] " +
                    //        ""+IDWorkshopReservation+"," +
                    //       ""+idworkshopparticipant;
                    value = value + "\nexecute [dbo].[AddWorkshopParticipant] " +
                            ""+IDWorkshopReservation+"," +
                            ""+idworkshopparticipant;
                }
                participantsid.clear();
                //odnośnie idworkshoparticipant powinien losować swoją wartość z
                // IDConferenceDayParticipat+conftickets+1 na razie na sztywno bierze po kolei uczestnika conference day
            }
        }
        return value;
        //value to całe "zamówienie" danego klienta czyli zapis na konferencje, dni konferencji, uczestników
        // konferencji, warsztaty i uczestników warsztatów
    }

    private static String createWorkshopEvents(String workshopName, int i, int j) {
        String conferencename, starttime, participantslimit, price, day;
        conferencename = ConferenceNames[i];
        day = Integer.toString(j + 1);
        starttime = StartTimes[r.nextInt(StartTimes.length)];
        price = Integer.toString(r.nextInt(50)+10);
        participantslimit = Integer.toString((r.nextInt(3) * 10)+30);

        return "execute [dbo].[AddWorkshopEvent] '" + conferencename + "','" + workshopName + "'," + day + ",'" +
                starttime + "'," + price + "," + participantslimit;
    }

    private static String createIndividualClients() {
        String country, firstname, lastname, middleinitial, zipcode, city, street, phone;
        //country = Countries[r.nextInt(Countries.length)];
        country = "Polska";
        firstname = FirstNames[r.nextInt(FirstNames.length)];
        lastname = LastNames[r.nextInt(LastNames.length)];
        middleinitial = Character.toString(MiddleInitials[r.nextInt(MiddleInitials.length)]);
        zipcode = ZipCodes[r.nextInt(ZipCodes.length)];
        city = Cities[r.nextInt(Cities.length)];
        street = Streets[r.nextInt(Streets.length)];
        phone = Integer.toString(r.nextInt(900000000)+100000000);
        return "execute [dbo].[AddIndividualClient] '" + country + "','" + firstname + "','" + lastname + "','" +
                middleinitial + "','" +
                "" + zipcode + "','" + city + "','" + street + "','" + phone + "'";

    }

    private static String createCompanyCLients(int i) {
        String country, companyname, contactname, contacttitle, nip, fax, zipcode, city, street, phone;
        country = Countries[r.nextInt(Countries.length)];
        companyname = CompanyNames[i];
        contactname = FirstNames[r.nextInt(FirstNames.length)] + " " + LastNames[r.nextInt(LastNames.length)];
        contacttitle = ContactTitles[r.nextInt(ContactTitles.length)];
        nip = Integer.toString(r.nextInt(900000000)*10+1000000000+r.nextInt(10));
        fax = Integer.toString(r.nextInt(900000000)+100000000);
        zipcode = ZipCodes[r.nextInt(ZipCodes.length)];
        city = Cities[r.nextInt(Cities.length)];
        street = Streets[r.nextInt(Streets.length)];
        phone = Integer.toString(r.nextInt(900000000)+100000000);
        return "execute [dbo].[AddCompanyClient] " + "'" + country + "','" + companyname + "','" + contactname + "','"
                + contacttitle + "','" + nip + "','" + fax + "','" + zipcode + "','" + city + "','" + street + "','"
                + phone + "'";
    }

    private static String createConferenceswithThresholds(int i) {
        String conferencename, startdate, enddate, price, studentdiscount, participantslimit, duedate1, duedate2;
        int day, month, year, pt1_month, pt1_year, pt2_month, pt2_year, iprice, duration_days, workshops_in_day, limit;
        conferencename = ConferenceNames[i];
        day = r.nextInt(26) + 1;
        InformationsAboutConferenceStartDate[i][1] = month = pt1_month = r.nextInt(12) + 1;
        InformationsAboutConferenceStartDate[i][0] = year = pt1_year = r.nextInt(3) + 2013;
        duration_days = r.nextInt(2) + 1;
        InformationsAboutWorkshops[i] = new String[duration_days + 1][];
        for (int j = 0; j < duration_days + 1; j++) {
            workshops_in_day = r.nextInt(2) + 1;
            InformationsAboutWorkshops[i][j] = new String[workshops_in_day];
        }
        startdate = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day);
        enddate = Integer.toString(year) + "-" + Integer.toString(month) + "-" + Integer.toString(day + duration_days);
        iprice = r.nextInt(300) + 50;
        price = Integer.toString(iprice);
        studentdiscount = Float.toString(r.nextFloat() / 3);
        limit = r.nextInt(4)*100 + 100;
        participantslimit = Integer.toString(limit);
        InformationsAboutConferenceStartDate[i][2] = limit;
        pt1_month--;
        if (pt1_month == 0) {
            pt1_month = 12;
            pt1_year--;
        }
        pt2_month = pt1_month - 1;
        pt2_year = pt1_year;
        if (pt2_month == 0) {
            pt2_month = 12;
            pt2_year--;
        }
        duedate1 = Integer.toString(pt1_year) + "-" + Integer.toString(pt1_month) + "-" + Integer.toString(day);
        duedate2 = Integer.toString(pt2_year) + "-" + Integer.toString(pt2_month) + "-" + Integer.toString(day);
        return "execute [dbo].[AddConference] '" + conferencename + "','" + startdate + "','" + enddate + "'," +
                price + "," + studentdiscount + "," + participantslimit + "\n" + "execute [dbo].[AddPriceThreshold] '" +
                conferencename + "','" + duedate1 + "'," + Integer.toString(iprice - 10) + "\n" + "execute [dbo]" +
                ".[AddPriceThreshold] '" +
                conferencename + "','" + duedate2 + "'," + Integer.toString(iprice - 20);
    }

    private static String createWorkshops(int i) {
        String workshopname, time;
        workshopname = Workshops[i];
        time = DurationTimes[r.nextInt(DurationTimes.length)];
        return "execute [dbo].[AddNewWorkshop] '" + workshopname + "','" + time + "','" + Description + "'";
    }


}
