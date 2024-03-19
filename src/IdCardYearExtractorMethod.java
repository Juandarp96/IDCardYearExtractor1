
public class IdCardYearExtractorMethod {
    
    // Method to extract the year from the ID card number
    public static int extractYear(long idNumber) {
        // Extract the first two digits as the year
        // To extract the first two digits, divide the idNumber by 1000000000L
        // The 'L' at the end denotes a long literal, ensuring the division is performed with long numbers
        int year = (int) (idNumber / 1000000000L);
        return year;
    }

    public static void main(String[] args) {
        // Example input
        long idNumber = 86021912345L;
        
        // Extract year from the ID card number using the extractYear method
        int year = extractYear(idNumber);
        
        // Print the extracted year
        System.out.println("Year: " + year);
    }
}
