/**
 *
 * Java Basic. Home Work #2
 * @autor Sergej Kel
 * @todo 7.9.2022
 * @date 15.9.2022
 */
class JavaBasic2Hw {
    public static void main(String[] args) {
        
        // taks 1
        String res = checkWeather(-1);
        System.out.println(res);
        
        //task 2
        boolean walk=canWalk(true,false);
        System.out.println(walk);
        
        //task 3
        int result=sum(2,3);
        System.out.println(result);
        
        result=sume(3,5);
        System.out.println(result);
        
        result=suma(7,5);
        System.out.println(result);
        
        float result2=sumo(4,3);
        System.out.println(result2);
        
        //task 4
        String mittwoch= dayOfWeek(1);
        System.out.println(mittwoch);
        
    }
    public static String checkWeather(int temperature) {
        String result ="";
        if (temperature < 0 ) {
            result = "It's frost";
        } else if (temperature > = 0 && temperature < = 18) {
            result ="It's cold";
        } else if (temperature > = 19 && temperature < = 28) {
            result= "It's warm";
        } else if (temperature > = 29) {
            result = "It's hot";
        }
        return result;
    }
    
    public static boolean canWalk(boolean isWeekend,boolean isRain) {
        if (isWeekend && !isRain) {//weekend yes,rain no
            return true;
        }
        return false;    
        
    }
    
    public static int sum(int a, int b) {
        return a+b;
    }
    
    public static int sume(int a, int b) {
        return a-b;
    }
    
    public static int suma(int a, int b) {
        return a*b;
    }
    
    public static float sumo(int a, int b) {
        return (float) a/b;
    }
    
    public static String dayOfWeek(int manday) {
        String mittwoch="";
        if (manday==1) {
            mittwoch="monday";
        } else if (manday==2) {
            mittwoch="Tuesday";
        }
        else if (manday==2) {
            mittwoch="Wednesday";
        }
        else if (manday==2) {
            mittwoch="Thursday";
        }
        else if (manday==2) {
            mittwoch="Friday";
        }
        else if (manday==2) {
            mittwoch="Saturday";
        }
        else if (manday==2) {
            mittwoch="Sunday";
        }
        return mittwoch;
    }
}