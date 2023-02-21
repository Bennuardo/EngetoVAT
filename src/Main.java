import java.io.IOException;

public class Main {

    public static final String VAT_OVER =  "vat-over-";
    public static final String TXT = ".txt";

    public static void main(String[] args) throws IOException {




        Countries register = new Countries();
        try {
            register.readCountryFromFile("vat-eu.csv");
        } catch (CountryException e){
            System.out.println("Chyba při načítání souboru:"+ e.getLocalizedMessage());
        }
        Countries.enterOrValueFromUser();
        Countries.processingData();
        register.writeCountryToFile(VAT_OVER +Countries.numberFromUser + TXT);
    }
}

