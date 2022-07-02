package com.matrix_maeny.calculator.activities;

import androidx.annotation.NonNull;

public class ConverterFunctions {

     /*
  Numeric evaluation starts
  * ==============================================================================================================================
  * */

    public String NumericConverter(long result,int flag){


        switch (flag){
            case 1:// to Binary
                return Long.toBinaryString(result);
            case 2:// to Hexadecimal
                return Long.toHexString(result);
            case 3:
                return Long.toOctalString(result);

        }

       return "";
    }


    public String floatToBinary(double result){



        long longType = (long) result;
        double flType = result - longType;

        String resultBinaryForm = Long.toBinaryString(longType);
        String fractionalPart = ".";

        for(int i=0;i<10;i++){
            flType = flType * 2;

            if(flType < 1){
                fractionalPart = fractionalPart.concat("0");
            }else if(flType > 1){
                fractionalPart = fractionalPart.concat("1");
                flType = flType -1;
            }else{
                fractionalPart = fractionalPart.concat("1");
                break;
            }

        }

        resultBinaryForm = resultBinaryForm.concat(fractionalPart);
        return resultBinaryForm;
    }
//    public String floatToOct(double result){
//
//
//
//        long longType = (long) result;
//        double flType = result - longType;
//
//        String resultOctalForm = Long.toOctalString(longType);
//        String fractionalPart = ".";
//
//        for(int i=0;i<10;i++){
//            flType = flType * 8;
//
//            int intType = (int)flType;
//            double fType = flType - intType;
//
//            if(fType >= 0){
//                fractionalPart = fractionalPart.concat(intType+ "");
//                if(fType == 0){
//                    break;
//                }
//            }
//
//        }
//
//        resultOctalForm = resultOctalForm.concat(fractionalPart);
//        return resultOctalForm;
//    }


     /*
  Numeric evaluation completed
  * ==============================================================================================================================
  * */


    /*
  Area evaluation starts
  * ==============================================================================================================================
  * */
    public double AreaEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "km²":
                result = kilometer(val, text2);
                break;
            case "ha":
                result = hectare(val, text2);
                break;
            case "a":
                result = areA(val, text2);
                break;
            case "m²":
                result = meterSquare(val, text2);
                break;
            case "dm²":
                result = deciSquare(val, text2);
                break;
            case "cm²":
                result = centiSquare(val, text2);
                break;
            case "mm²":
                result = milliSquare(val, text2);
                break;
            case "µm²":
                result = squareMicron(val, text2);
                break;
            case "ac":
                result = Acre(val, text2);
                break;
            case "mile²":
                result = squareMile(val, text2);
                break;
            case "yd²":
                result = squareYard(val, text2);
                break;
            case "ft²":
                result = squareFeet(val, text2);
                break;
            case "in²":
                result = squareInch(val, text2);
                break;
            case "rd²":
                result = squareRod(val, text2);
                break;
            case "qing":
                result = quing(val, text2);
                break;
            case "chi²":
                result = squareChi(val, text2);
                break;
            case "cun²":
                result = squareCun(val, text2);
                break;

            case "mu":
                result = MuFunction(val, text2);
                break;


        }

        return result;
    }
    private double kilometer(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val;
                break;
            case "ha":
                result = val * 100;
                break;
            case "a":
                result = val * 10000;
                break;
            case "m²":
                result = val * 1000000;
                break;
            case "dm²":
                result = val * 100000000;
                break;
            case "cm²":
                result = val * (Math.pow(10, 10));
                break;
            case "mm²":
                result = val * (Math.pow(10, 12));
                break;
            case "µm²":
                result = val * (Math.pow(10, 18));
                break;
            case "ac":
                result = val * (247.105407);
                break;
            case "mile²":
                result = val * (0.386102159);
                break;
            case "yd²":
                result = val * (1195990.05);
                break;
            case "ft²":
                result = val * (10763910.4);
                break;
            case "in²":
                result = val * (1.5500031) * Math.pow(10, 9);
                break;
            case "rd²":
                result = val * (39536.861);
                break;
            case "qing":
                result = val * 15;
                break;
            case "chi²":
                result = val * (9000000);
                break;
            case "cun²":
                result = val * 9 * (Math.pow(10, 8));
                break;

            case "mu":
                result = val * 1500;
                break;


        }

        return result;
    }
    private double hectare(double val, @NonNull String setToUnit) {                                                  //Hectare function
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.01);
                break;
            case "ha":
                result = val;
                break;
            case "a":
                result = val * (100);
                break;
            case "m²":
                result = val * (10000);
                break;
            case "dm²":
                result = val * (Math.pow(10, 6));
                break;
            case "cm²":
                result = val * (Math.pow(10, 8));
                break;
            case "mm²":
                result = val * (Math.pow(10, 10));
                break;
            case "µm²":
                result = val * (Math.pow(10, 16));
                break;
            case "ac":
                result = val * (2.47105407);
                break;
            case "mile²":
                result = val * (0.00386102159);
                break;
            case "yd²":
                result = val * (11959.9005);
                break;
            case "ft²":
                result = val * (107639.104);
                break;
            case "in²":
                result = val * (15500031);
                break;
            case "rd²":
                result = val * (395.36861);
                break;
            case "qing":
                result = val * 0.15;
                break;
            case "chi²":
                result = val * (9000000);
                break;
            case "cun²":
                result = val * 9 * (Math.pow(10, 8));
                break;

            case "mu":
                result = val * 15;
                break;


        }

        return result;
    }
    private double areA(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.0001);
                break;
            case "ha":
                result = val * (0.01);
                break;
            case "a":
                result = val;
                break;
            case "m²":
                result = val * (100);
                break;
            case "dm²":
                result = val * (Math.pow(10, 4));
                break;
            case "cm²":
                result = val * (Math.pow(10, 6));
                break;
            case "mm²":
                result = val * (Math.pow(10, 8));
                break;
            case "µm²":
                result = val * (Math.pow(10, 14));
                break;
            case "ac":
                result = val * (0.0247105407);
                break;
            case "mile²":
                result = val * (0.0000386102159);
                break;
            case "yd²":
                result = val * (119.599005);
                break;
            case "ft²":
                result = val * (1076.39104);
                break;
            case "in²":
                result = val * (155000.31);
                break;
            case "rd²":
                result = val * (3.9536861);
                break;
            case "qing":
                result = val * 0.0015;
                break;
            case "chi²":
                result = val * (900);
                break;
            case "cun²":
                result = val * 9 * (Math.pow(10, 4));
                break;

            case "mu":
                result = val * 0.15;
                break;


        }
        return result;
    }
    private double meterSquare(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.000001);
                break;
            case "ha":
                result = val * (0.0001);
                break;
            case "a":
                result = val * (0.01);
                break;
            case "m²":
                result = val;
                break;
            case "dm²":
                result = val * (Math.pow(10, 2));
                break;
            case "cm²":
                result = val * (Math.pow(10, 4));
                break;
            case "mm²":
                result = val * (Math.pow(10, 6));
                break;
            case "µm²":
                result = val * (Math.pow(10, 12));
                break;
            case "ac":
                result = val * (0.000247105407);
                break;
            case "mile²":
                result = val * (0.000000386102159);
                break;
            case "yd²":
                result = val * (1.19599005);
                break;
            case "ft²":
                result = val * (10.7639104);
                break;
            case "in²":
                result = val * (1550.0031);
                break;
            case "rd²":
                result = val * (0.039536861);
                break;
            case "qing":
                result = val * 0.000015;
                break;
            case "chi²":
                result = val * (9);
                break;
            case "cun²":
                result = val * 9 * (Math.pow(10, 2));
                break;

            case "mu":
                result = val * 0.0015;
                break;


        }
        return result;
    }
    private double deciSquare(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (Math.pow(10, -8));
                break;
            case "ha":
                result = val * (Math.pow(10, -6));
                break;
            case "a":
                result = val * (0.0001);
                break;
            case "m²":
                result = val * 0.01;
                break;
            case "dm²":
                result = val;
                break;
            case "cm²":
                result = val * (Math.pow(10, 2));
                break;
            case "mm²":
                result = val * (Math.pow(10, 4));
                break;
            case "µm²":
                result = val * (Math.pow(10, 10));
                break;
            case "ac":
                result = val * (2.47105407) * Math.pow(10, -6);
                break;
            case "mile²":
                result = val * (3.86102159) * Math.pow(10, -9);
                break;
            case "yd²":
                result = val * (0.0119599005);
                break;
            case "ft²":
                result = val * (0.107639104);
                break;
            case "in²":
                result = val * (15.500031);
                break;
            case "rd²":
                result = val * (0.00039536861);
                break;
            case "qing":
                result = val * 1.5 * Math.pow(10, -7);
                break;
            case "chi²":
                result = val * (0.09);
                break;
            case "cun²":
                result = val * 9;
                break;

            case "mu":
                result = val * 1.5 * Math.pow(10, -5);
                break;


        }
        return result;
    }
    private double centiSquare(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (Math.pow(10, -10));
                break;
            case "ha":
                result = val * (Math.pow(10, -8));
                break;
            case "a":
                result = val * (Math.pow(10, -6));
                break;
            case "m²":
                result = val * 0.0001;
                break;
            case "dm²":
                result = val * 0.01;
                break;
            case "cm²":
                result = val;
                break;
            case "mm²":
                result = val * (Math.pow(10, 2));
                break;
            case "µm²":
                result = val * (Math.pow(10, 8));
                break;
            case "ac":
                result = val * (2.47105407) * Math.pow(10, -8);
                break;
            case "mile²":
                result = val * (3.86102159) * Math.pow(10, -11);
                break;
            case "yd²":
                result = val * (0.000119599005);
                break;
            case "ft²":
                result = val * (0.00107639104);
                break;
            case "in²":
                result = val * (0.15500031);
                break;
            case "rd²":
                result = val * (3.9536861) * (Math.pow(10, -6));
                break;
            case "qing":
                result = val * 1.5 * Math.pow(10, -9);
                break;
            case "chi²":
                result = val * (0.0009);
                break;
            case "cun²":
                result = val * 0.09;
                break;

            case "mu":
                result = val * 1.5 * Math.pow(10, -7);
                break;


        }
        return result;
    }
    private double milliSquare(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (Math.pow(10, -12));
                break;
            case "ha":
                result = val * (Math.pow(10, -10));
                break;
            case "a":
                result = val * (Math.pow(10, -8));
                break;
            case "m²":
                result = val * (Math.pow(10, -6));
                break;
            case "dm²":
                result = val * 0.0001;
                break;
            case "cm²":
                result = val * 0.01;
                break;
            case "mm²":
                result = val;//*(Math.pow(10,2));
                break;
            case "µm²":
                result = val * (Math.pow(10, 6));
                break;
            case "ac":
                result = val * (2.47105407) * Math.pow(10, -10);
                break;
            case "mile²":
                result = val * (3.86102159) * Math.pow(10, -13);
                break;
            case "yd²":
                result = val * (1.19599005) * Math.pow(10, -6);
                break;
            case "ft²":
                result = val * (1.07639104) * Math.pow(10, -5);
                break;
            case "in²":
                result = val * (0.0015500031);
                break;
            case "rd²":
                result = val * (3.9536861) * (Math.pow(10, -8));
                break;
            case "qing":
                result = val * 1.5 * Math.pow(10, -11);
                break;
            case "chi²":
                result = val * 9 * (Math.pow(10, -6));
                break;
            case "cun²":
                result = val * 0.0009;
                break;

            case "mu":
                result = val * 1.5 * Math.pow(10, -9);
                break;


        }
        return result;
    }
    private double squareMicron(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (Math.pow(10, -18));
                break;
            case "ha":
                result = val * (Math.pow(10, -16));
                break;
            case "a":
                result = val * (Math.pow(10, -14));
                break;
            case "m²":
                result = val * (Math.pow(10, -12));
                break;
            case "dm²":
                result = val * Math.pow(10, -10);
                break;
            case "cm²":
                result = val * Math.pow(10, -8);
                break;
            case "mm²":
                result = val * (Math.pow(10, -6));
                break;
            case "µm²":
                result = val;//*(Math.pow(10,-4));
                break;
            case "ac":
                result = val * (2.47105407) * Math.pow(10, -16);
                break;
            case "mile²":
                result = val * (3.86102159) * Math.pow(10, -19);
                break;
            case "yd²":
                result = val * (1.19599005) * Math.pow(10, -12);
                break;
            case "ft²":
                result = val * (1.07639104) * Math.pow(10, -11);
                break;
            case "in²":
                result = val * (1.5500031) * Math.pow(10, -9);
                break;
            case "rd²":
                result = val * (3.9536861) * (Math.pow(10, -14));
                break;
            case "qing":
                result = val * 1.5 * Math.pow(10, -17);
                break;
            case "chi²":
                result = val * 9 * (Math.pow(10, -12));
                break;
            case "cun²":
                result = val * 9 * Math.pow(10, -10);
                break;

            case "mu":
                result = val * 1.5 * Math.pow(10, -15);
                break;


        }
        return result;
    }
    private double Acre(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.004046856);
                break;
            case "ha":
                result = val * (0.4046856);
                break;
            case "a":
                result = val * (Math.pow(10, -14));
                break;
            case "m²":
                result = val * (40.46856);
                break;
            case "dm²":
                result = val * 404685.6;
                break;
            case "cm²":
                result = val * 40468560;
                break;
            case "mm²":
                result = val * (4.046856) * (Math.pow(10, 9));
                break;
            case "µm²":
                result = val * (4.046856) * (Math.pow(10, 15));
                ;//*(Math.pow(10,-4));
                break;
            case "ac":
                result = val;//*(2.47105407) * Math.pow(10,-16);
                break;
            case "mile²":
                result = val * (0.00156249984);//(3.86102159) * Math.pow(10,-19);
                break;
            case "yd²":
                result = val * (4839.99949);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * (43559.9955);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * (6272639.35);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * (1590999983);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (0.06070284);//1.5 * Math.pow(10,-17);
                break;
            case "chi²":
                result = val * (36421.704);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (3642170.4);// 9 * Math.pow(10,-10);
                break;

            case "mu":
                result = val * (6.070284);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareMile(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (2.58998811);
                break;
            case "ha":
                result = val * (258.998811);
                break;
            case "a":
                result = val * (25899.8811);//(Math.pow(10,-14));
                break;
            case "m²":
                result = val * (2589988.11);
                break;
            case "dm²":
                result = val * 258998811;
                break;
            case "cm²":
                result = val * 2.58998811 * Math.pow(10, 10);
                break;
            case "mm²":
                result = val * (2.58998811) * (Math.pow(10, 12));
                break;
            case "µm²":
                result = val * (2.58998811) * (Math.pow(10, 18));
                break;
            case "ac":
                result = val * 640.000067;//*(2.47105407) * Math.pow(10,-16);
                break;
            case "mile²":
                result = val;//*(0.00156249984);//(3.86102159) * Math.pow(10,-19);
                break;
            case "yd²":
                result = val * (3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * (27878400);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * (4.0144896) * Math.pow(10, 9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * (102400);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (38.8498217);//1.5 * Math.pow(10,-17);
                break;
            case "chi²":
                result = val * (23309893);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (2.3309893) * Math.pow(10, 9);// 9 * Math.pow(10,-10);
                break;

            case "mu":
                result = val * (3884.98217);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareYard(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (8.3612736) * Math.pow(10, -7);
                break;
            case "ha":
                result = val * (8.3612736) * Math.pow(10, -5);
                break;
            case "a":
                result = val * (0.0083612736);//(Math.pow(10,-14));
                break;
            case "m²":
                result = val * (0.83612736);
                break;
            case "dm²":
                result = val * 83.612736;
                break;
            case "cm²":
                result = val * 8361.2736;// * Math.pow(10,10);
                break;
            case "mm²":
                result = val * (836127.36);//*(Math.pow(10,12));
                break;
            case "µm²":
                result = val * (8.3612736) * Math.pow(10, 11);
                break;
            case "ac":
                result = val * 0.000206611592;//*(2.47105407) * Math.pow(10,-16);
                break;
            case "mile²":
                result = val * (3.22830579) * Math.pow(10, -7);
                break;
            case "yd²":
                result = val;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * (9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * (1296);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * (0.0330578512);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (1.25419104) * Math.pow(10, -5);
                break;
            case "chi²":
                result = val * (7.52514624);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (752.514624);//9 * (Math.pow(10,-12));
                break;

            case "mu":
                result = val * (0.00125419104);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareFeet(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (9.290304) * Math.pow(10, -8);
                break;
            case "ha":
                result = val * (9.290304) * Math.pow(10, -6);
                break;
            case "a":
                result = val * (0.0009290304);//(Math.pow(10,-14));
                break;
            case "m²":
                result = val * (0.9290304);
                break;
            case "dm²":
                result = val * (9.290304);
                break;
            case "cm²":
                result = val * (929.0304);
                break;
            case "mm²":
                result = val * (92903.04);
                break;
            case "µm²":
                result = val * (9.290304) * Math.pow(10, 10);
                break;
            case "ac":
                result = val * 2.29568435 * Math.pow(10, -5);
                break;
            case "mile²":
                result = val * (3.58700643) * Math.pow(10, -8);
                break;
            case "yd²":
                result = val * 0.111111111;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * (0.00367309458);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (1.3935456) * Math.pow(10, -6);
                break;
            case "chi²":
                result = val * (0.83612736);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (83.612736);//9 * (Math.pow(10,-12));
                break;
            case "gongli²":
                result = val * (9.290304) * Math.pow(10, -8);// Math.pow(10,-18);
                break;
            case "mu":
                result = val * (0.00013935456);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareInch(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (6.4516) * Math.pow(10, -10);
                break;
            case "ha":
                result = val * (6.4516) * Math.pow(10, -8);
                break;
            case "a":
                result = val * (6.4516) * Math.pow(10, -6);
                break;
            case "m²":
                result = val * (0.00064516);
                break;
            case "dm²":
                result = val * (0.064516);
                break;
            case "cm²":
                result = val * (6.4516);
                break;
            case "mm²":
                result = val * (645.16);
                break;
            case "µm²":
                result = val * (645160000);// * Math.pow(10,10);
                break;
            case "ac":
                result = val * 1.59422525 * Math.pow(10, -7);
                break;
            case "mile²":
                result = val * (2.49097669) * Math.pow(10, -10);
                break;
            case "yd²":
                result = val * 0.000771604938;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 0.00694444444;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * (2.55076013) * Math.pow(10, -5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (9.6774) * Math.pow(10, -9);
                break;
            case "chi²":
                result = val * (0.00580644);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (0.580644);//9 * (Math.pow(10,-12));
                break;
            case "gongli²":
                result = val * (6.4516) * Math.pow(10, -10);// Math.pow(10,-18);
                break;
            case "mu":
                result = val * (90677) * Math.pow(10, 7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareRod(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (2.52928526) * Math.pow(10, -5);
                break;
            case "ha":
                result = val * (0.00252928526);//* Math.pow(10,-8);
                break;
            case "a":
                result = val * (0.252928526);// * Math.pow(10,-6);
                break;
            case "m²":
                result = val * (25.2928526);
                break;
            case "dm²":
                result = val * (2529.28526);
                break;
            case "cm²":
                result = val * (252928.526);
                break;
            case "mm²":
                result = val * (25292852.6);
                break;
            case "µm²":
                result = val * (2.52928526) * Math.pow(10, 13);// * Math.pow(10,10);
                break;
            case "ac":
                result = val * 0.00625000065;//* Math.pow(10,-7);
                break;
            case "mile²":
                result = val * (9.765625) * Math.pow(10, -6);
                break;
            case "yd²":
                result = val * 30.25;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 272.25;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * 39204;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val;// * (2.55076013) * Math.pow(10,-5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * (0.00037939279);// * Math.pow(10,-9);
                break;
            case "chi²":
                result = val * (227.635674);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (22763.5674);//9 * (Math.pow(10,-12));
                break;
            case "mu":
                result = val * (0.037939279);//*Math.pow(10,7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double quing(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.0666666667);// * Math.pow(10,-5);
                break;
            case "ha":
                result = val * (6.66666667);//* Math.pow(10,-8);
                break;
            case "a":
                result = val * (666.666667);// * Math.pow(10,-6);
                break;
            case "m²":
                result = val * (66666.6667);
                break;
            case "dm²":
                result = val * (6666666.67);
                break;
            case "cm²":
                result = val * (666666667);
                break;
            case "mm²":
                result = val * (6.66666667) * Math.pow(10, 10);
                break;
            case "µm²":
                result = val * (6.66666667) * Math.pow(10, 16);
                break;
            case "ac":
                result = val * 16.4736938;//* Math.pow(10,-7);
                break;
            case "mile²":
                result = val * (0.0257401439);// * Math.pow(10,-6);
                break;
            case "yd²":
                result = val * 79732.6698;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 717594.028;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * 103333540;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * 2635.79074;// * (2.55076013) * Math.pow(10,-5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val;//*(0.00037939279);// * Math.pow(10,-9);
                break;
            case "chi²":
                result = val * (600000);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (60000000);//9 * (Math.pow(10,-12));
                break;
            case "mu":
                result = val * (100);//*Math.pow(10,7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double MuFunction(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (0.000666666667);// * Math.pow(10,-5);
                break;
            case "ha":
                result = val * (0.0666666667);//* Math.pow(10,-8);
                break;
            case "a":
                result = val * (6.66666667);// * Math.pow(10,-6);
                break;
            case "m²":
                result = val * (666.666667);
                break;
            case "dm²":
                result = val * (66666.6667);
                break;
            case "cm²":
                result = val * (6666666.67);
                break;
            case "mm²":
                result = val * (666666667);// * Math.pow(10,10);
                break;
            case "µm²":
                result = val * (6.66666667) * Math.pow(10, 14);
                break;
            case "ac":
                result = val * 0.164736938;//* Math.pow(10,-7);
                break;
            case "mile²":
                result = val * (0.000257401439);// * Math.pow(10,-6);
                break;
            case "yd²":
                result = val * 797.326698;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 7175.94028;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * 1033335.40;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * 26.3579074;// * (2.55076013) * Math.pow(10,-5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * 0.01;//*(0.00037939279);// * Math.pow(10,-9);
                break;
            case "chi²":
                result = val * (6000);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (600000);//9 * (Math.pow(10,-12));
                break;
            case "mu":
                result = val;// * (100);//*Math.pow(10,7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareChi(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (1.11111111) * Math.pow(10, -7);// * Math.pow(10,-5);
                break;
            case "ha":
                result = val * (1.11111111) * Math.pow(10, -5);// * Math.pow(10,-5);
                break;
            case "a":
                result = val * (0.00111111111);//*Math.pow(10,-7);// * Math.pow(10,-5);
                break;
            case "m²":
                result = val * (0.111111111);//*Math.pow(10,-7);// * Math.pow(10,-5);
                break;
            case "dm²":
                result = val * (11.1111111);
                break;
            case "cm²":
                result = val * (1111.11111);
                break;
            case "mm²":
                result = val * (111111.111);// * Math.pow(10,10);
                break;
            case "µm²":
                result = val * (1.11111111) * Math.pow(10, 11);
                break;
            case "ac":
                result = val * 0.164736938;//* Math.pow(10,-7);
                break;
            case "mile²":
                result = val * (2.74561564) * Math.pow(10, -5);// * Math.pow(10,-6);
                break;
            case "yd²":
                result = val * 0.132887783;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 1.19599005;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * 172.222567;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * 0.00439298456;// * (2.55076013) * Math.pow(10,-5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * 1.66666667 * Math.pow(10, -6);//*(0.00037939279);// * Math.pow(10,-9);
                break;
            case "chi²":
                result = val;// * (6000);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val * (100);//9 * (Math.pow(10,-12));
                break;
            case "mu":
                result = val * 0.000166666667;// * (100);//*Math.pow(10,7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }
    private double squareCun(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km²":
                result = val * (1.11111111) * Math.pow(10, -9);// * Math.pow(10,-5);
                break;
            case "ha":
                result = val * (1.11111111) * Math.pow(10, -7);// * Math.pow(10,-5);
                break;
            case "a":
                result = val * (1.11111111) * Math.pow(10, -5);//*Math.pow(10,-7);// * Math.pow(10,-5);
                break;
            case "m²":
                result = val * (0.00111111111);//*Math.pow(10,-7);// * Math.pow(10,-5);
                break;
            case "dm²":
                result = val * (0.111111111);
                break;
            case "cm²":
                result = val * (11.1111111);
                break;
            case "mm²":
                result = val * (1111.11111);// * Math.pow(10,10);
                break;
            case "µm²":
                result = val * (1.11111111) * Math.pow(10, 9);
                break;
            case "ac":
                result = val * 2.74561564 * Math.pow(10, -7);//* Math.pow(10,-7);
                break;
            case "mile²":
                result = val * (4.29002398) * Math.pow(10, -10);// * Math.pow(10,-6);
                break;
            case "yd²":
                result = val * 0.00132887783;//*(3097600);//(1.19599005) * Math.pow(10,-12);
                break;
            case "ft²":
                result = val * 0.0119599005;//*(9);//(1.07639104) * Math.pow(10,-11);
                break;
            case "in²":
                result = val * 1.72222567;// * (144);// * Math.pow(10,9);//(1.5500031) * Math.pow(10,-9);
                break;
            case "rd²":
                result = val * 4.39298456 * Math.pow(10, -5);// * (2.55076013) * Math.pow(10,-5);//(3.9536861) *(Math.pow(10,-14));
                break;
            case "qing":
                result = val * 1.66666667 * Math.pow(10, -8);//*(0.00037939279);// * Math.pow(10,-9);
                break;
            case "chi²":
                result = val * 0.01;// * (6000);//9 * (Math.pow(10,-12));
                break;
            case "cun²":
                result = val;// * (100);//9 * (Math.pow(10,-12));
                break;
            case "mu":
                result = val * 1.66666667 * Math.pow(10, -6);// * (100);//*Math.pow(10,7);// * Math.pow(10,-7);//1.5 * Math.pow(10,-15);
                break;


        }
        return result;
    }


  /*
  Area evaluation completed
  * ==============================================================================================================================
  * */

    /*
  Length evaluation starts
  * ==============================================================================================================================
  * */
        //kilometer length conversion
    public double LengthEvaluationFucntion(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "km":
                result = kilometerLength(val, text2);
                break;
            case "m":
                result = meterLength(val, text2);
                break;
            case "dm":
                result = decimeterLength(val, text2);
                break;
            case "cm":
                result = centimeterLength(val, text2);
                break;
            case "mm":
                result = millimeterLength(val, text2);
                break;
            case "µm":
                result = micrometerLength(val, text2);
                break;
            case "nm":
                result = nanometerLength(val, text2);
                break;
            case "pm":
                result = picometerLength(val, text2);
                break;
            case "nmi":
                result = nmimileLength(val, text2);
                break;
            case "mile":
                result = mileLength(val, text2);
                break;
            case "yd":
                result = yardLength(val, text2);
                break;
            case "ft":
                result = footLength(val, text2);
                break;
            case "in":
                result = inchLength(val, text2);
                break;

        }

        return result;
    }
    private double kilometerLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val;// * (Math.pow(1, 1));
                break;
            case "m":
                result = val * (Math.pow(10, 3));
                break;
            case "dm":
                result = val * (Math.pow(10, 4));
                break;
            case "cm":
                result = val * (Math.pow(10, 5));
                break;
            case "mm":
                result = val * (Math.pow(10, 6));
                break;
            case "µm":
                result = val * (Math.pow(10, 9));
                break;
            case "nm":
                result = val * (Math.pow(10, 12));
                break;
            case "pm":
                result = val * (Math.pow(10, 15));
                break;
            case "nmi":
                result = val * 0.539956803;// (Math.pow(10, 10));
                break;
            case "mile":
                result = val * 0.621371192;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val * 1093.6133;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3280.8399;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 39370.0787;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double meterLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -3));
                break;
            case "m":
                result = val;// * (Math.pow(10, 3));
                break;
            case "dm":
                result = val * (Math.pow(10, 1));
                break;
            case "cm":
                result = val * (Math.pow(10, 2));
                break;
            case "mm":
                result = val * (Math.pow(10, 3));
                break;
            case "µm":
                result = val * (Math.pow(10, 6));
                break;
            case "nm":
                result = val * (Math.pow(10, 9));
                break;
            case "pm":
                result = val * (Math.pow(10, 12));
                break;
            case "nmi":
                result = val * 0.000539956803;// (Math.pow(10, 10));
                break;
            case "mile":
                result = val * 0.000621371192;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val * 1.0936133;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3.2808399;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 39.3700787;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double decimeterLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -4));
                break;
            case "m":
                result = val* (Math.pow(10, 1));
                break;
            case "dm":
                result = val;// * (Math.pow(10, 0));
                break;
            case "cm":
                result = val * (Math.pow(10, 1));
                break;
            case "mm":
                result = val * (Math.pow(10, 2));
                break;
            case "µm":
                result = val * (Math.pow(10, 5));
                break;
            case "nm":
                result = val * (Math.pow(10, 8));
                break;
            case "pm":
                result = val * (Math.pow(10, 11));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -5));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -5));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val * 0.10936133;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 0.32808399;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 3.93700787;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double centimeterLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -5));
                break;
            case "m":
                result = val* (Math.pow(10, -2));
                break;
            case "dm":
                result = val * (Math.pow(10, -1));
                break;
            case "cm":
                result = val * (Math.pow(10, 0));
                break;
            case "mm":
                result = val * (Math.pow(10, 1));
                break;
            case "µm":
                result = val * (Math.pow(10, 4));
                break;
            case "nm":
                result = val * (Math.pow(10, 7));
                break;
            case "pm":
                result = val * (Math.pow(10, 10));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -6));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -6));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val * 0.010936133;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 0.032808399;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 0.393700787;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double millimeterLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -6));
                break;
            case "m":
                result = val* (Math.pow(10, -3));
                break;
            case "dm":
                result = val * (Math.pow(10, -2));
                break;
            case "cm":
                result = val * (Math.pow(10, -1));
                break;
            case "mm":
                result = val * (Math.pow(10, 0));
                break;
            case "µm":
                result = val * (Math.pow(10, 3));
                break;
            case "nm":
                result = val * (Math.pow(10, 6));
                break;
            case "pm":
                result = val * (Math.pow(10, 9));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -7));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -7));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val * 0.0010936133;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 0.0032808399;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 0.0393700787;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double micrometerLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -9));
                break;
            case "m":
                result = val* (Math.pow(10, -6));
                break;
            case "dm":
                result = val * (Math.pow(10, -5));
                break;
            case "cm":
                result = val * (Math.pow(10, -4));
                break;
            case "mm":
                result = val * (Math.pow(10, -3));
                break;
            case "µm":
                result = val * (Math.pow(10, 0));
                break;
            case "nm":
                result = val * (Math.pow(10, 3));
                break;
            case "pm":
                result = val * (Math.pow(10, 6));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -10));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -10));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val *1.0936133 * (Math.pow(10, -6));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3.2808399 * (Math.pow(10, -6));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 3.93700787 * (Math.pow(10, -5));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double nanometerLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -12));
                break;
            case "m":
                result = val* (Math.pow(10, -9));
                break;
            case "dm":
                result = val * (Math.pow(10, -8));
                break;
            case "cm":
                result = val * (Math.pow(10, -7));
                break;
            case "mm":
                result = val * (Math.pow(10, -6));
                break;
            case "µm":
                result = val * (Math.pow(10, -3));
                break;
            case "nm":
                result = val * (Math.pow(10, 0));
                break;
            case "pm":
                result = val * (Math.pow(10, 3));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -13));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -13));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val *1.0936133 * (Math.pow(10, -9));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3.2808399 * (Math.pow(10, -9));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 3.93700787 * (Math.pow(10, -8));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double picometerLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * (Math.pow(10, -15));
                break;
            case "m":
                result = val* (Math.pow(10, -12));
                break;
            case "dm":
                result = val * (Math.pow(10, -11));
                break;
            case "cm":
                result = val * (Math.pow(10, -10));
                break;
            case "mm":
                result = val * (Math.pow(10, -9));
                break;
            case "µm":
                result = val * (Math.pow(10, -6));
                break;
            case "nm":
                result = val * (Math.pow(10, -3));
                break;
            case "pm":
                result = val * (Math.pow(10, 0));
                break;
            case "nmi":
                result = val * 5.39956803 *(Math.pow(10, -16));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val *6.21371192 *(Math.pow(10, -16));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val *1.0936133 * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3.2808399 * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 3.93700787 * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double nmimileLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * 1.852;// (Math.pow(10, -15));
                break;
            case "m":
                result = val* 1852;// (Math.pow(10, -12));
                break;
            case "dm":
                result = val * 18520;//(Math.pow(10, -11));
                break;
            case "cm":
                result = val * 1852 *(Math.pow(10, 2));
                break;
            case "mm":
                result = val * 1852*(Math.pow(10, 3));
                break;
            case "µm":
                result = val * 1.852*(Math.pow(10, 9));
                break;
            case "nm":
                result = val * 1.852*(Math.pow(10, 12));
                break;
            case "pm":
                result = val * 1852*(Math.pow(10, 15));
                break;
            case "nmi":
                result = val ;//* 5.39956803 *(Math.pow(10, -16));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val * 1.15077945;//6.21371192 *(Math.pow(10, -16));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val *2025.37183;// * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 6076.11549;// * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 72913.3858;// * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double mileLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * 1.609344;// (Math.pow(10, -15));
                break;
            case "m":
                result = val* 1609.344;// (Math.pow(10, -12));
                break;
            case "dm":
                result = val * 16093.44;//(Math.pow(10, -11));
                break;
            case "cm":
                result = val * 160934.4;
                break;
            case "mm":
                result = val * 1609344;
                break;
            case "µm":
                result = val * 1.609344*(Math.pow(10, 9));
                break;
            case "nm":
                result = val * 1.609344*(Math.pow(10, 12));
                break;
            case "pm":
                result = val * 1.609344*(Math.pow(10, 15));
                break;
            case "nmi":
                result = val * 0.868976242;// *(Math.pow(10, -16));// (Math.pow(10, 10));
                break;
            case "mile":
                result = val;//6.21371192 *(Math.pow(10, -16));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val *1760;// * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 5280;// * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 63360;// * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double yardLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * 9.144*(Math.pow(10, -4));
                break;
            case "m":
                result = val * 9.144*(Math.pow(10, -1));
                break;
            case "dm":
                result = val * 9.144*(Math.pow(10, 0));
                break;
            case "cm":
                result = val * 9.144*(Math.pow(10, 1));
                break;
            case "mm":
                result = val * 9.144*(Math.pow(10, 2));
                break;
            case "µm":
                result = val * 9144*(Math.pow(10, 2));
                break;
            case "nm":
                result = val * 9144*(Math.pow(10, 5));
                break;
            case "pm":
                result = val * 9.144*(Math.pow(10, 11));
                break;
            case "nmi":
                result = val * 0.000493736501;//* (Math.pow(10, 10));
                break;
            case "mile":
                result = val *0.000568181818;// *(Math.pow(10, -16));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val ;//*1760;// * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val * 3;//5280;// * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 36;// * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double footLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * 3.048*(Math.pow(10, -4));
                break;
            case "m":
                result = val * 3.048*(Math.pow(10, -1));
                break;
            case "dm":
                result = val * 3.048;//*(Math.pow(10, 1));
                break;
            case "cm":
                result = val * 3.048*(Math.pow(10, 1));
                break;
            case "mm":
                result = val * 3.048*(Math.pow(10, 2));
                break;
            case "µm":
                result = val * 3048*(Math.pow(10, 2));
                break;
            case "nm":
                result = val * 3048*(Math.pow(10, 5));
                break;
            case "pm":
                result = val * 3.048*(Math.pow(10, 11));
                break;
            case "nmi":
                result = val * 0.000164578834;//* (Math.pow(10, 10));
                break;
            case "mile":
                result = val *0.000189393939;// *(Math.pow(10, -16));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val*0.333333333 ;//*1760;// * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val ;//5280;// * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 12;// * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }
    private double inchLength(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "km":
                result = val * 2.54*(Math.pow(10, -5));
                break;
            case "m":
                result = val * 2.54*(Math.pow(10, -2));
                break;
            case "dm":
                result = val * 2.54*(Math.pow(10, -1));
                break;
            case "cm":
                result = val * 2.54;//*(Math.pow(10, 0));
                break;
            case "mm":
                result = val * 2.54*(Math.pow(10, 1));
                break;
            case "µm":
                result = val * 254*(Math.pow(10, 2));
                break;
            case "nm":
                result = val * 254*(Math.pow(10, 5));
                break;
            case "pm":
                result = val * 2.54*(Math.pow(10, 10));
                break;
            case "nmi":
                result = val * 1.37149028 * (Math.pow(10, -5));
                break;
            case "mile":
                result = val *1.57828283 *(Math.pow(10, -5));;//(Math.pow(10, 10));
                break;
            case "yd":
                result = val*0.0277777778 ;//*1760;// * (Math.pow(10, -12));;//(Math.pow(10, 10));
                break;
            case "ft":
                result = val *0.833333333;//5280;// * (Math.pow(10, -12));;// (Math.pow(10, 10));
                break;
            case "in":
                result = val * 1;// * (Math.pow(10, -11));;//(Math.pow(10, 10));
                break;

        }

        return result;
    }

     /*
  Length evaluation completed
  * ==============================================================================================================================
  * */

     /*
  Volume evaluation starts
  * ==============================================================================================================================
  * */
     public double VolumeEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
         double result = 0;
         switch (text1) {
             case "m³":
                 result = meterVolume(val, text2);
                 break;
             case "cm³":
                 result = centimeterVolume(val, text2);
                 break;
             case "mm³":
                 result = millimeterVolume(val, text2);
                 break;
             case "hl":
                 result = hectolitreVolume(val, text2);
                 break;
             case "L":
                 result = litreVolume(val, text2);
                 break;
             case "dl":
                 result = decilitreVolume(val, text2);
                 break;
             case "cl":
                 result = centilitreVolume(val, text2);
                 break;
             case "ft³":
                 result = footVolume(val, text2);
                 break;
             case "in³":
                 result = inchVolume(val, text2);
                 break;
             case "af³":
                 result = acrefootVolume(val, text2);
                 break;
             case "yd³":
                 result = yardVolume(val, text2);
                 break;


         }

         return result;
     }

    private double meterVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val;// * (Math.pow(1, 1));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, 6));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 9));
                 break;
             case "hl":
                 result = val * (Math.pow(10, 1));
                 break;
             case "L":
                 result = val * (Math.pow(10, 3));
                 break;
             case "dl":
                 result = val * (Math.pow(10, 4));
                 break;
             case "cl":
                 result = val * (Math.pow(10, 5));
                 break;
             case "ft³":
                 result = val * 35.3146667;// (Math.pow(10, 5));
                 break;
             case "in³":
                 result = val * 61023.7441;//(Math.pow(10, 5));
                 break;
             case "yd³":
                 result = val * 1.30795062;//(Math.pow(10, 5));
                 break;
             case "af³":
                 result = val * 0.000810372771;//(Math.pow(10, 5));
                 break;


         }

         return result;
     }
    private double centimeterVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -6));
                 break;
             case "cm³":
                 result = val;// * (Math.pow(10, 6));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 3));
                 break;
             case "hl":
                 result = val * (Math.pow(10, -5));
                 break;
             case "L":
                 result = val * (Math.pow(10, -3));
                 break;
             case "dl":
                 result = val * (Math.pow(10, -2));
                 break;
             case "cl":
                 result = val * (Math.pow(10, -1));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, -5));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, -2));
                 break;
             case "yd³":
                 result = val * 1.30795062*(Math.pow(10, -6));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -10));
                 break;


         }

         return result;
     }
    private double millimeterVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -9));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, -3));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 0));
                 break;
             case "hl":
                 result = val * (Math.pow(10, -8));
                 break;
             case "L":
                 result = val * (Math.pow(10, -6));
                 break;
             case "dl":
                 result = val * (Math.pow(10, -2));
                 break;
             case "cl":
                 result = val * (Math.pow(10, -4));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, -8));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, -5));
                 break;
             case "yd³":
                 result = val * 1.30795062*(Math.pow(10, -9));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -13));
                 break;


         }

         return result;
     }
    private double hectolitreVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -1));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, 5));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 8));
                 break;
             case "hl":
                 result = val * (Math.pow(10, 1));
                 break;
             case "L":
                 result = val * (Math.pow(10, 2));
                 break;
             case "dl":
                 result = val * (Math.pow(10, 3));
                 break;
             case "cl":
                 result = val * (Math.pow(10, 4));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, 0));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, 3));
                 break;
             case "yd³":
                 result = val * 0.130795062*(Math.pow(10, 0));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -5));
                 break;


         }

         return result;
     }
    private double litreVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -3));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, 3));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 6));
                 break;
             case "hl":
                 result = val * (Math.pow(10, -2));
                 break;
             case "L":
                 result = val * (Math.pow(10, 0));
                 break;
             case "dl":
                 result = val * (Math.pow(10, 1));
                 break;
             case "cl":
                 result = val * (Math.pow(10, 2));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, -2));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, 1));
                 break;
             case "yd³":
                 result = val * 0.130795062*(Math.pow(10, -2));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -7));
                 break;


         }

         return result;
     }
    private double decilitreVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -3));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, 2));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 5));
                 break;
             case "hl":
                 result = val * (Math.pow(10, 3));
                 break;
             case "L":
                 result = val * (Math.pow(10, -1));
                 break;
             case "dl":
                 result = val * (Math.pow(10, 0));
                 break;
             case "cl":
                 result = val * (Math.pow(10, 1));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, -3));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, 0));
                 break;
             case "yd³":
                 result = val * 0.130795062*(Math.pow(10, -3));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -8));
                 break;


         }

         return result;
     }
    private double centilitreVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * (Math.pow(10, -5));
                 break;
             case "cm³":
                 result = val * (Math.pow(10, 1));
                 break;
             case "mm³":
                 result = val * (Math.pow(10, 4));
                 break;
             case "hl":
                 result = val * (Math.pow(10, -4));
                 break;
             case "L":
                 result = val * (Math.pow(10, -2));
                 break;
             case "dl":
                 result = val * (Math.pow(10, -1));
                 break;
             case "cl":
                 result = val * (Math.pow(10, 0));
                 break;
             case "ft³":
                 result = val * 3.53146667* (Math.pow(10, -4));
                 break;
             case "in³":
                 result = val * 6.10237441*(Math.pow(10, -1));
                 break;
             case "yd³":
                 result = val * 1.30795062*(Math.pow(10, -5));
                 break;
             case "af³":
                 result = val *8.10372771*(Math.pow(10, -9));
                 break;


         }

         return result;
     }
    private double footVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * 0.0283168466;//(Math.pow(10, -6));
                 break;
             case "cm³":
                 result = val * 28316.8466;// (Math.pow(10, 1));
                 break;
             case "mm³":
                 result = val * 28316846.6;//(Math.pow(10, 4));
                 break;
             case "hl":
                 result = val * 0.283168466;//(Math.pow(10, -4));
                 break;
             case "L":
                 result = val * 28.3168466;//(Math.pow(10, -2));
                 break;
             case "dl":
                 result = val * 283.168466;//(Math.pow(10, -1));
                 break;
             case "cl":
                 result = val * 2831.68466;//(Math.pow(10, 0));
                 break;
             case "ft³":
                 result = val;// * 3.53146667* (Math.pow(10, -4));
                 break;
             case "in³":
                 result = val * 1728;//*(Math.pow(10, -1));
                 break;
             case "yd³":
                 result = val * 0.037037037;//*(Math.pow(10, -5));
                 break;
             case "af³":
                 result = val *2.29472015*(Math.pow(10, -5));
                 break;


         }

         return result;
     }
    private double inchVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * 1.6387064*(Math.pow(10, -5));
                 break;
             case "cm³":
                 result = val * 16.387064;// (Math.pow(10, 1));
                 break;
             case "mm³":
                 result = val * 16387.064;//(Math.pow(10, 4));
                 break;
             case "hl":
                 result = val * 0.00016387064;//(Math.pow(10, -4));
                 break;
             case "L":
                 result = val * 0.016387064;//(Math.pow(10, -2));
                 break;
             case "dl":
                 result = val * 0.16387064;//(Math.pow(10, -1));
                 break;
             case "cl":
                 result = val * 1.6387064;//(Math.pow(10, 0));
                 break;
             case "ft³":
                 result = val * 0.000578703704;//* (Math.pow(10, -4));
                 break;
             case "in³":
                 result = val;// * 1728;//*(Math.pow(10, -1));
                 break;
             case "yd³":
                 result = val * 2.14334705*(Math.pow(10, -5));
                 break;
             case "af³":
                 result = val *1.32796305*(Math.pow(10, -8));
                 break;


         }

         return result;
     }
    private double yardVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * 0.764554858;//*(Math.pow(10, -5));
                 break;
             case "cm³":
                 result = val * 764554.858;// (Math.pow(10, 1));
                 break;
             case "mm³":
                 result = val * 764554858;//(Math.pow(10, 4));
                 break;
             case "hl":
                 result = val * 7.64554858;//(Math.pow(10, -4));
                 break;
             case "L":
                 result = val * 764.554858;//(Math.pow(10, -2));
                 break;
             case "dl":
                 result = val * 7645.54858;//(Math.pow(10, -1));
                 break;
             case "cl":
                 result = val * 76455.4858;//(Math.pow(10, 0));
                 break;
             case "ft³":
                 result = val * 27;//* (Math.pow(10, -4));
                 break;
             case "in³":
                 result = val*46656;// * 1728;//*(Math.pow(10, -1));
                 break;
             case "yd³":
                 result = val;// * 2.14334705*(Math.pow(10, -5));
                 break;
             case "af³":
                 result = val *0.000619574439;//*(Math.pow(10, -8));
                 break;


         }

         return result;
     }
    private double acrefootVolume(double val, @NonNull String setToUnit) {
         double result = 0;
         switch (setToUnit) {
             case "m³":
                 result = val * 1234;//*(Math.pow(10, -5));
                 break;
             case "cm³":
                 result = val * 1.234* (Math.pow(10, 9));
                 break;
             case "mm³":
                 result = val * 1.234*(Math.pow(10, 12));
                 break;
             case "hl":
                 result = val * 12340;//(Math.pow(10, -4));
                 break;
             case "L":
                 result = val * 1234*(Math.pow(10, 3));
                 break;
             case "dl":
                 result = val * 1234*(Math.pow(10, 4));
                 break;
             case "cl":
                 result = val * 1234*(Math.pow(10, 5));
                 break;
             case "ft³":
                 result = val * 43578.2987;//* (Math.pow(10, -4));
                 break;
             case "in³":
                 result = val*75303300.2;// * 1728;//*(Math.pow(10, -1));
                 break;
             case "yd³":
                 result = val* 1614.01106;//*(Math.pow(10, -5));
                 break;
             case "af³":
                 result = val ;//*0.000619574439;//*(Math.pow(10, -8));
                 break;


         }

         return result;
     }


     /*
  Volume evaluation completed
  * ==============================================================================================================================
  * */

     /*
  Speed evaluation starts
  * ==============================================================================================================================
  * */
     public double SpeedEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
         double result = 0;
         switch (text1) {
             case "m/s":
                 result = meterPerSecond(val, text2);
                 break;
             case "km/h":
                 result = kilometerPerHour(val, text2);
                 break;
             case "km/s":
                 result = kilometerPerSecond(val, text2);
                 break;
             case "mph":
                 result = milesPerHour(val, text2);
                 break;
             case "ips":
                 result = inchPerSecond(val, text2);
                 break;



         }

         return result;
     }

    private double meterPerSecond(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "m/s":
                result = val * (Math.pow(10, 0));
                break;
            case "km/h":
                result = val*3.6;// * (Math.pow(10, 6));
                break;
            case "km/s":
                result = val *  (Math.pow(10, -3));
                break;
            case "mph":
                result = val * 2.23693629;//(Math.pow(10, -5));
                break;
            case "ips":
                result = val * 39.3700787;//(Math.pow(10, -3));
                break;



        }

        return result;
    }
    private double kilometerPerHour(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "m/s":
                result = val * 0.277777778;//(Math.pow(10, 0));
                break;
            case "km/h":
                result = val;//*3.6;// * (Math.pow(10, 6));
                break;
            case "km/s":
                result = val * 2.77777778 *(Math.pow(10, -4));
                break;
            case "mph":
                result = val * 0.621371192;//(Math.pow(10, -5));
                break;
            case "ips":
                result = val * 10.936133;//(Math.pow(10, -3));
                break;



        }

        return result;
    }
    private double kilometerPerSecond(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "m/s":
                result = val *(Math.pow(10, 3));
                break;
            case "km/h":
                result = val*3600;// * (Math.pow(10, 6));
                break;
            case "km/s":
                result = val;// * 2.77777778 *(Math.pow(10, -4));
                break;
            case "mph":
                result = val * 2236.93629;//(Math.pow(10, -5));
                break;
            case "ips":
                result = val * 39370.0787;//(Math.pow(10, -3));
                break;



        }

        return result;
    }
    private double milesPerHour(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "m/s":
                result = val * 0.44704;//(Math.pow(10, 3));
                break;
            case "km/h":
                result = val*1.609344;// * (Math.pow(10, 6));
                break;
            case "km/s":
                result = val * 0.00044704;// *(Math.pow(10, -4));
                break;
            case "mph":
                result = val;// * 2236.93629;//(Math.pow(10, -5));
                break;
            case "ips":
                result = val * 17.6;//(Math.pow(10, -3));
                break;



        }

        return result;
    }
    private double inchPerSecond(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "m/s":
                result = val * 0.0254;//(Math.pow(10, 3));
                break;
            case "km/h":
                result = val*0.09144;// * (Math.pow(10, 6));
                break;
            case "km/s":
                result = val * 2.54 *(Math.pow(10, -5));
                break;
            case "mph":
                result = val* 0.0568181818;//(Math.pow(10, -5));
                break;
            case "ips":
                result = val;// * 17.6;//(Math.pow(10, -3));
                break;



        }

        return result;
    }

  /*
  Speed evaluation completed
  * ==============================================================================================================================
  * */

      /*
  Time evaluation starts
  * ==============================================================================================================================
  * */

    public double TimeEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "y":
                result = yearConverter(val, text2);
                break;
            case "wk":
                result = weekConverter(val, text2);
                break;
            case "d":
                result = dayConverter(val, text2);
                break;
            case "h":
                result = hourConverter(val, text2);
                break;
            case "min":
                result = minuteConverter(val, text2);
                break;
            case "sec":
                result = secondConverter(val, text2);
                break;
            case "ms":
                result = millisecondConverter(val, text2);
                break;
            case "µs":
                result = microsecondConverter(val, text2);
                break;
            case "ps":
                result = picosecondConverter(val, text2);
                break;

        }

        return result;
    }

    private double yearConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val;// * (Math.pow(10, 0));
                break;
            case "wk":
                result = val*52.1528571;// * (Math.pow(10, 6));
                break;
            case "d":
                result = val * 365;// (Math.pow(10, -3));
                break;
            case "h":
                result = val * 8760;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 525600;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val * 31536000;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val * 3.153*(Math.pow(10, 10));
                break;
            case "µs":
                result = val * 3.153*(Math.pow(10, 13));
                break;
            case "ps":
                result = val * 3.153*(Math.pow(10, 19));
                break;

        }

        return result;
    }
    private double weekConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 0.0191780822;// * (Math.pow(10, 0));
                break;
            case "wk":
                result = val;//*52.1528571;// * (Math.pow(10, 6));
                break;
            case "d":
                result = val * 7;// (Math.pow(10, -3));
                break;
            case "h":
                result = val * 168;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 10080;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val * 604800;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val * 6.048*(Math.pow(10, 5));
                break;
            case "µs":
                result = val * 6.048*(Math.pow(10, 11));
                break;
            case "ps":
                result = val * 6.048*(Math.pow(10, 17));
                break;

        }

        return result;
    }
    private double dayConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 0.00273972603;// * (Math.pow(10, 0));
                break;
            case "wk":
                result = val*0.142857143;// * (Math.pow(10, 6));
                break;
            case "d":
                result = val;// (Math.pow(10, -3));
                break;
            case "h":
                result = val * 24;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 1440;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val * 86400;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val * 864*(Math.pow(10, 5));
                break;
            case "µs":
                result = val * 8.64*(Math.pow(10, 10));
                break;
            case "ps":
                result = val * 8.64*(Math.pow(10, 6));
                break;

        }

        return result;
    }
    private double hourConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 0.000114155251;// * (Math.pow(10, 0));
                break;
            case "wk":
                result = val*0.60595238095;// * (Math.pow(10, 6));
                break;
            case "d":
                result = val * 0.0416666667;// (Math.pow(10, -3));
                break;
            case "h":
                result = val;// * 24;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 60;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val * 3600;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val * 36*(Math.pow(10, 5));
                break;
            case "µs":
                result = val * 3.6*(Math.pow(10, 9));
                break;
            case "ps":
                result = val * 3.6*(Math.pow(10, 15));
                break;

        }

        return result;
    }
    private double minuteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 1.90258752 * (Math.pow(10, -6));
                break;
            case "wk":
                result = val*9.92063492* (Math.pow(10, -5));
                break;
            case "d":
                result = val * 0.000694444441;// (Math.pow(10, -3));
                break;
            case "h":
                result = val * 0.0166666667;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 1;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val * 60;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val * 6*(Math.pow(10, 4));
                break;
            case "µs":
                result = val * 6*(Math.pow(10, 7));
                break;
            case "ps":
                result = val * 6*(Math.pow(10, 13));
                break;

        }

        return result;
    }
    private double secondConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 3.1709792 * (Math.pow(10, -8));
                break;
            case "wk":
                result = val*1.65343915* (Math.pow(10, -6));
                break;
            case "d":
                result = val * 1.15740741* (Math.pow(10, -5));
                break;
            case "h":
                result = val * 0.000277777778;//(Math.pow(10, -5));
                break;
            case "min":
                result = val * 0.0166666667;//(Math.pow(10, -3));
                break;
            case "sec":
                result = val;// * 60;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val*(Math.pow(10, 3));
                break;
            case "µs":
                result = val * (Math.pow(10, 6));
                break;
            case "ps":
                result = val * (Math.pow(10, 12));
                break;

        }

        return result;
    }
    private double millisecondConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 3.1709792 * (Math.pow(10, -11));
                break;
            case "wk":
                result = val*1.65343915* (Math.pow(10, -9));
                break;
            case "d":
                result = val * 1.15740741* (Math.pow(10, -8));
                break;
            case "h":
                result = val * 2.77777778*(Math.pow(10, -7));
                break;
            case "min":
                result = val * 1.66666667*(Math.pow(10, -5));
                break;
            case "sec":
                result = val * 0.001;// * 60;//(Math.pow(10, -3));
                break;
            case "ms":
                result = val;//*(Math.pow(10, 3));
                break;
            case "µs":
                result = val * (Math.pow(10, 3));
                break;
            case "ps":
                result = val * (Math.pow(10, 9));
                break;

        }

        return result;
    }
    private double microsecondConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 3.1709792 * (Math.pow(10, -14));
                break;
            case "wk":
                result = val*1.65343915* (Math.pow(10, -12));
                break;
            case "d":
                result = val * 1.15740741* (Math.pow(10, -11));
                break;
            case "h":
                result = val * 2.77777778*(Math.pow(10, -10));
                break;
            case "min":
                result = val * 1.66666667*(Math.pow(10, -8));
                break;
            case "sec":
                result = val *(Math.pow(10, -6));
                break;
            case "ms":
                result = val * 0.001;//*(Math.pow(10, 3));
                break;
            case "µs":
                result = val;// * (Math.pow(10, 3));
                break;
            case "ps":
                result = val * (Math.pow(10, 6));
                break;

        }

        return result;
    }
    private double picosecondConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "y":
                result = val* 3.1709792 * (Math.pow(10, -20));
                break;
            case "wk":
                result = val*1.65343915* (Math.pow(10, -8));
                break;
            case "d":
                result = val * 1.15740741* (Math.pow(10, -17));
                break;
            case "h":
                result = val * 2.77777778*(Math.pow(10, -16));
                break;
            case "min":
                result = val * 1.66666667*(Math.pow(10, -14));
                break;
            case "sec":
                result = val *(Math.pow(10, -12));
                break;
            case "ms":
                result = val*(Math.pow(10, -9));
                break;
            case "µs":
                result = val*(Math.pow(10, -6));
                break;
            case "ps":
                result = val;// * (Math.pow(10, 6));
                break;

        }

        return result;
    }

        /*
  Time evaluation completed
  * ==============================================================================================================================
  * */

        /*
  Weight evaluation starts
  * ==============================================================================================================================
  * */

    public double WeightEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "t":
                result = tonneConverter(val, text2);
                break;
            case "kg":
                result = kgConverter(val, text2);
                break;
            case "g":
                result = gramConverter(val, text2);
                break;
            case "mg":
                result = milligramConverter(val, text2);
                break;
            case "µg":
                result = microgramConverter(val, text2);
                break;
            case "q":
                result = quintolConverter(val, text2);
                break;
            case "lb":
                result = poundsConverter(val, text2);
                break;
            case "oz":
                result = ozConverter(val, text2);
                break;
            case "ct":
                result = ctConverter(val, text2);
                break;
            case "gr":
                result = grainConverter(val, text2);
                break;

        }

        return result;
    }

    private double tonneConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val;// * (Math.pow(10, 0));
                break;
            case "kg":
                result = val* (Math.pow(10, 3));
                break;
            case "g":
                result = val *  (Math.pow(10, 6));
                break;
            case "mg":
                result = val * (Math.pow(10, 9));
                break;
            case "µg":
                result = val * (Math.pow(10, 12));
                break;
            case "q":
                result = val * 10;//(Math.pow(10, -3));
                break;
            case "lb":
                result = val * 2204.62262;//*(Math.pow(10, 10));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, 6));
                break;
            case "gr":
                result = val * 15432358.4;//*(Math.pow(10, 19));
                break;
            case "oz":
                result = val * 35273.9619;//*(Math.pow(10, 19));
                break;

        }

        return result;
    }
    private double kgConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val * (Math.pow(10, -3));
                break;
            case "kg":
                result = val;//* (Math.pow(10, 3));
                break;
            case "g":
                result = val *  (Math.pow(10, 3));
                break;
            case "mg":
                result = val * (Math.pow(10, 6));
                break;
            case "µg":
                result = val * (Math.pow(10, 9));
                break;
            case "q":
                result = val * 0.001;//(Math.pow(10, -3));
                break;
            case "lb":
                result = val * 2.20462262;//*(Math.pow(10, 10));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, 3));
                break;
            case "gr":
                result = val * 15432.3584;//*(Math.pow(10, 19));
                break;
            case "oz":
                result = val * 35.2739619;//*(Math.pow(10, 19));
                break;

        }

        return result;
    }
    private double gramConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val * (Math.pow(10, -6));
                break;
            case "kg":
                result = val*0.001;//* (Math.pow(10, 3));
                break;
            case "g":
                result = val;// *  (Math.pow(10, 3));
                break;
            case "mg":
                result = val * (Math.pow(10, 3));
                break;
            case "µg":
                result = val * (Math.pow(10, 6));
                break;
            case "q":
                result = val *(Math.pow(10, -5));
                break;
            case "lb":
                result = val * 0.00220462262;//*(Math.pow(10, 10));
                break;
            case "ct":
                result = val * 5;//*(Math.pow(10, 3));
                break;
            case "gr":
                result = val * 15.4323584;//*(Math.pow(10, 19));
                break;
            case "oz":
                result = val * 0.0352739619;//*(Math.pow(10, 19));
                break;

        }

        return result;
    }
    private double milligramConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val * (Math.pow(10, -9));
                break;
            case "kg":
                result = val* (Math.pow(10, 6));
                break;
            case "g":
                result = val*(Math.pow(10, -3));
                break;
            case "mg":
                result = val;// * (Math.pow(10, 3));
                break;
            case "µg":
                result = val * (Math.pow(10, 3));
                break;
            case "q":
                result = val *(Math.pow(10, -8));
                break;
            case "lb":
                result = val * 2.20462262*(Math.pow(10, -6));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, -3));
                break;
            case "gr":
                result = val * 0.0154323584;//*(Math.pow(10, 19));
                break;
            case "oz":
                result = val * 3.52739619*(Math.pow(10, -5));
                break;

        }

        return result;
    }
    private double microgramConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val * (Math.pow(10, -12));
                break;
            case "kg":
                result = val* (Math.pow(10, -9));
                break;
            case "g":
                result = val*(Math.pow(10, -6));
                break;
            case "mg":
                result = val* (Math.pow(10, -3));
                break;
            case "µg":
                result = val * 1;//(Math.pow(10, 3));
                break;
            case "q":
                result = val *(Math.pow(10, -11));
                break;
            case "lb":
                result = val * 2.20462262*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, -6));
                break;
            case "gr":
                result = val * 1.54323584*(Math.pow(10, -5));
                break;
            case "oz":
                result = val * 3.52739619*(Math.pow(10, -8));
                break;

        }

        return result;
    }
    private double quintolConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val * (Math.pow(10, -1));
                break;
            case "kg":
                result = val* (Math.pow(10, 2));
                break;
            case "g":
                result = val*(Math.pow(10, 5));
                break;
            case "mg":
                result = val* (Math.pow(10, 8));
                break;
            case "µg":
                result = val *(Math.pow(10, 11));
                break;
            case "q":
                result = val;// *(Math.pow(10, 11));
                break;
            case "lb":
                result = val * 220.462262;//*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, 5));
                break;
            case "gr":
                result = val * 1543235.84;//*(Math.pow(10, -5));
                break;
            case "oz":
                result = val * 3527.39619;//*(Math.pow(10, -8));
                break;

        }

        return result;
    }
    private double poundsConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val *0.00045359237;// (Math.pow(10, -1));
                break;
            case "kg":
                result = val* 0.45359237;//(Math.pow(10, 2));
                break;
            case "g":
                result = val* 453.59237;//(Math.pow(10, 5));
                break;
            case "mg":
                result = val* 453592.37;//(Math.pow(10, 8));
                break;
            case "µg":
                result = val *453592370;//(Math.pow(10, 11));
                break;
            case "q":
                result = val*0.0045359237;// *(Math.pow(10, 11));
                break;
            case "lb":
                result = val;// * 220.462262;//*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 2267.96185;//*(Math.pow(10, 5));
                break;
            case "gr":
                result = val * 7000;//*(Math.pow(10, -5));
                break;
            case "oz":
                result = val * 16;//*(Math.pow(10, -8));
                break;

        }

        return result;
    }
    private double ozConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val *2.83495231 * (Math.pow(10, -5));
                break;
            case "kg":
                result = val* 0.0283495231;//(Math.pow(10, 2));
                break;
            case "g":
                result = val* 28.3495231;//(Math.pow(10, 5));
                break;
            case "mg":
                result = val* 28349.5231;//(Math.pow(10, 8));
                break;
            case "µg":
                result = val *28349523.1;//(Math.pow(10, 11));
                break;
            case "q":
                result = val*0.000283495231;// *(Math.pow(10, 11));
                break;
            case "lb":
                result = val*0.0625;// * 220.462262;//*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 141.747616;//*(Math.pow(10, 5));
                break;
            case "gr":
                result = val * 437.5;//*(Math.pow(10, -5));
                break;
            case "oz":
                result = val;// * 16;//*(Math.pow(10, -8));
                break;

        }

        return result;
    }
    private double ctConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val *2 * (Math.pow(10, -7));
                break;
            case "kg":
                result = val* 0.002;//(Math.pow(10, 2));
                break;
            case "g":
                result = val* 0.2;//(Math.pow(10, 5));
                break;
            case "mg":
                result = val* 200;//(Math.pow(10, 8));
                break;
            case "µg":
                result = val *2*(Math.pow(10, 5));
                break;
            case "q":
                result = val *2*(Math.pow(10, -6));
                break;
            case "lb":
                result = val*0.000440924524;// * 220.462262;//*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 1;//*(Math.pow(10, 5));
                break;
            case "gr":
                result = val * 3.08647167;//*(Math.pow(10, -5));
                break;
            case "oz":
                result = val*0.00705479237;// * 16;//*(Math.pow(10, -8));
                break;

        }

        return result;
    }
    private double grainConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "t":
                result = val *15432358.4;// * (Math.pow(10, -7));
                break;
            case "kg":
                result = val* 1000;//(Math.pow(10, 2));
                break;
            case "g":
                result = val* (Math.pow(10, 6));
                break;
            case "mg":
                result = val* (Math.pow(10, 9));
                break;
            case "µg":
                result = val *2*(Math.pow(10, 12));
                break;
            case "q":
                result = val *2*(Math.pow(10, -10));
                break;
            case "lb":
                result = val*2204.62262;// * 220.462262;//*(Math.pow(10, -9));
                break;
            case "ct":
                result = val * 5*(Math.pow(10, 6));
                break;
            case "gr":
                result = val;// * 15432358.4;//*(Math.pow(10, -5));
                break;
            case "oz":
                result = val*35273.9619;// * 16;//*(Math.pow(10, -8));
                break;

        }

        return result;
    }

     /*
  Weight evaluation completed
  * ==============================================================================================================================
  * */

         /*
  Temperature evaluation starts
  * ==============================================================================================================================
  * */

    public double TemperatureEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "°C":
                result = celciusConverter(val, text2);
                break;
            case "°K":
                result = kelvinConverter(val, text2);
                break;
            case "°F":
                result = farenheitConverter(val, text2);
                break;


        }

        return result;
    }

    private double celciusConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "°C":
                result = val;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "°K":
                result = val+ 273.15;//(Math.pow(10, 2));
                break;
            case "°F":
                result = (val*1.8)+32;
                break;

        }

        return result;
    }
    private double kelvinConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "°C":
                result = val - 273.15;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "°K":
                result = val;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "°F":

                result = ((val - 273.15)*1.8) + 32;
                break;

        }

        return result;
    }
    private double farenheitConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "°C":
                result = (val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "°K":
                result = ((val-32)/1.8) + 273.15;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "°F":

                result = val;
                break;

        }

        return result;
    }

         /*
  Temperature evaluation completed
  * ==============================================================================================================================
  * */


          /*
  Data evaluation start
  * ==============================================================================================================================
  * */

    public double DataEvaluationFunction(@NonNull String text1, @NonNull String text2, double val) {
        double result = 0;
        switch (text1) {
            case "B":
                result = byteConverter(val, text2);
                break;
            case "KB":
                result = kiloByteConverter(val, text2);
                break;
            case "MB":
                result = megaBByteConverter(val, text2);
                break;
            case "GB":
                result = gigaByteConverter(val, text2);
                break;
            case "TB":
                result = teraByteConverter(val, text2);
                break;
            case "PB":
                result = petaByteConverter(val, text2);
                break;

        }

        return result;
    }
    private double byteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val;//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val * 9.53674316 * Math.pow(10,-7);
                break;
            case "GB":
                result = val * 9.31322575 * Math.pow(10,-10);
                break;
            case "TB":
                result = val * 9.09494702 * Math.pow(10,-13);
                break;
            case "PB":
                result = val * 8.8817842 * Math.pow(10,-16);
                break;
        }

        return result;
    }
    private double kiloByteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val * 1024;//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val;//result * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val * 0.0009765625;
                break;
            case "GB":
                result = val * 9.53674316 * Math.pow(10,-7);
                break;
            case "TB":
                result = val * 9.31322575 * Math.pow(10,-10);
                break;
            case "PB":
                result = val * 9.09494702 * Math.pow(10,-13);
                break;
        }

        return result;
    }
    private double megaBByteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val * 1048576;//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val * 1024;//result * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val;//* 0.0009765625;
                break;
            case "GB":
                result = val* 0.0009765625;
                break;
            case "TB":
                result = val * 9.53674316 * Math.pow(10,-7);
                break;
            case "PB":
                result = val * 9.31322575 * Math.pow(10,-10);

                break;
        }

        return result;
    }
    private double gigaByteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val * 1.07374182 * Math.pow(10,9);//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val * 1048576;//result * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val*1024;//* 0.0009765625;
                break;
            case "GB":
                result = val;//* 0.0009765625;
                break;
            case "TB":
                result = val* 0.0009765625;
                break;
            case "PB":
                result = val * 9.53674316 * Math.pow(10,-7);


                break;
        }

        return result;
    }
    private double teraByteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val * 1.09951163 * Math.pow(10,12);//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val * 1.07374182 * Math.pow(10,9);//result * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val * 1048576;
                break;
            case "GB":
                result = val*1024;
                break;
            case "TB":
                result = val;//* 0.0009765625;
                break;
            case "PB":
                result = val* 0.0009765625;



                break;
        }

        return result;
    }
    private double petaByteConverter(double val, @NonNull String setToUnit) {
        double result = 0;
        switch (setToUnit) {
            case "B":
                result = val * 1.12589991 * Math.pow(10,15);//(val-32)/1.8;// *15432358.4;// * (Math.pow(10, -7));
                break;
            case "KB":
                result = val * 1.09951163 * Math.pow(10,12);//result * 0.0009765625;//+ 273.15;//(Math.pow(10, 2));
                break;
            case "MB":
                result = val * 1.07374182 * Math.pow(10,9);
                break;
            case "GB":
                result = val * 1048576;

                break;
            case "TB":
                result = val*1024;

                break;
            case "PB":
                result = val;

                break;
        }

        return result;
    }

          /*
  Data evaluation completed
  * ==============================================================================================================================
  * */





    public static void main(String[] args) {
    }
}
