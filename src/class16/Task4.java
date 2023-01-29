package class16;

public class Task4 {
    //Create a method that will say Hello
    //in different language based on the country
    //that will passed when method is executed
    public static void main(String[] args) {
        Task4 inp=new Task4();
        System.out.println(inp.sayHello("INDIA"));
        String country= inp.sayHello("turkey");
        System.out.println(country);
    }

    String sayHello (String countryName) {
        switch (countryName.toLowerCase()) {
            case "usa":
                return "Hello";// Why we don't use break point for this methods examples?
            case "india":// Because return also does the same job as break, when return see answer it executed answer of input and breaks the method
                return "हेलो";
            case "russia":
                return "Привет";
            case "france":
                return "Salut";
            case "germany":
                return "Hallo";
            case "turkey":
                return "Merhaba";
            case "israel":
                return "שלום";
            case "china":
                return "你好";
            case "japan":
                return "こんにちは";
            case "thailand":
                return "สวัสดี";
            default:
                return "False input!";
        }
    }}