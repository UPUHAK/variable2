public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int variableInt=5000000;
        byte variableByte=12;
        short variableShort=10200;
        long variableLong=125L;
        float variableFloat=7.7777777f;
        double variableDouble=9.999999999999;
        System.out.println("Значение переменной variableInt с типом данных int равно "+variableInt);
        System.out.println("Значение переменной variableByte с типом данных byte равно "+variableByte);
        System.out.println("Значение переменной variableShort с типом данных short равно "+variableShort);
        System.out.println("Значение переменной variableLong с типом данных long равно "+variableLong);
        System.out.println("Значение переменной variableFloat с типом данных float равно "+variableFloat);
        System.out.println("Значение переменной variableDouble с типом данных double равно "+variableDouble);

        float kg=27.12f;
        long largeNumber=987678965549L;
        float liters=2.786f;
        short days=569;
        short money=-159;
        short seconds=27897;
        byte lessons=67;
        System.out.println("Рассмотрели числа: "+kg+" "+largeNumber+" "+liters+" "+days+" "+money+" "+seconds+" "+lessons);

        short teacher1=23;
        short teacher2=27;
        short teacher3=30;
        short totalPaper=480;
        short oneStudentPaper= (short) (totalPaper/(teacher1+teacher2+teacher3));
        System.out.println("На каждого ученика рассчитано "+oneStudentPaper+" листов бумаги");

        int efficiency2minutes=16;
        int efficiency1minutes=efficiency2minutes/2;
        int numberOfMinutes=20;
        System.out.println("За "+numberOfMinutes+" минут машина произвела "+numberOfMinutes*efficiency1minutes+" штук бутылок");
        int efficiency1day=efficiency1minutes*60*24;
        System.out.println("За сутки машина произвела "+efficiency1day+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+3*efficiency1day+" штук бутылок");
        System.out.println("За месяц машина произвела "+30*efficiency1day+" штук бутылок");

        int totalPaint=120;
        int oneClassroomWhitePaint=2;
        int oneClassroomBrownPaint=4;
        int numbnumberOfClassrooms=totalPaint/(oneClassroomWhitePaint+oneClassroomBrownPaint);
        int totalWhitePaint=oneClassroomWhitePaint*numbnumberOfClassrooms;
        int totalBrownPaint=oneClassroomBrownPaint*numbnumberOfClassrooms;
        System.out.println("В школе, где "+numbnumberOfClassrooms+" классов, нужно "+totalWhitePaint+" банок белой краски и "+totalBrownPaint+" банок коричневой краски");

        int weightBanana=80;
        int weightIceCream=100;
        int weightEgg=70;
        int volumeMilk=200;
        int weightMilk=volumeMilk/100*105;
        int numberBananas=5;
        int numberIceCream=2;
        int numberEggs=4;
        float cocktailWeightInGrams=weightBanana*numberBananas+weightIceCream*numberIceCream+weightEgg*numberEggs+weightMilk;
        float cocktailWeightInKilograms=cocktailWeightInGrams/1000;
        System.out.println("Вес коктейля для завтрака в граммах составляет "+cocktailWeightInGrams+", в килограммах составляет "+cocktailWeightInKilograms);

        int dailyWeightLoss1=250;
        int numberOfDays1=7000/dailyWeightLoss1;
        int dailyWeightLoss2=500;
        int numberOfDays2=7000/dailyWeightLoss2;
        int averageNumberOfDays=(numberOfDays1+numberOfDays2)/2;
        System.out.println("При ежедневном снижении веса на "+dailyWeightLoss1+" грамм потребуется "+numberOfDays1+" дней. При ежедневном снижении веса на "+dailyWeightLoss2+" грамм потребуется "+numberOfDays2+" дней. Среднее количество дней составит "+averageNumberOfDays);

        int salaryMasha2023=67760;
        int salaryDenis2023=83690;
        int salaryChristina2023=76230;
        int salaryMasha2024= (int) (salaryMasha2023*1.1);
        int salaryDenis2024= (int) (salaryDenis2023*1.1);
        int salaryChristina2024= (int) (salaryChristina2023*1.1);
        int differenceAnnualIncomeMasha=(salaryMasha2024-salaryMasha2023)*12;
        int differenceAnnualIncomeDenis=(salaryDenis2024-salaryDenis2023)*12;
        int differenceAnnualIncomeChristina=(salaryChristina2024-salaryChristina2023)*12;
        System.out.println("Маша теперь получает "+salaryMasha2024+" рублей. Годовой доход вырос на "+differenceAnnualIncomeMasha+" рублей.");
        System.out.println("Денис теперь получает "+salaryDenis2024+" рублей. Годовой доход вырос на "+differenceAnnualIncomeDenis+" рублей.");
        System.out.println("Кристина теперь получает "+salaryChristina2024+" рублей. Годовой доход вырос на "+differenceAnnualIncomeChristina+" рублей.");
    }
}