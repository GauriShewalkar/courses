// This class represents basic trade data received from NSE
public class TradeVariablesExample {

    public static void main(String[] args) {

        // Unique trade identifier received from exchange (alphanumeric)
        String tradeId = "NSE202412280001";

        // Client code mapped to broker back-office system
        String clientCode = "CLIENT123";

        // ISIN uniquely identifies a security in Indian markets
        String isin = "INE009A01021";

        // Quantity of shares traded (whole number, no decimals)
        int quantity = 100;

        // Trade execution price (can have decimal values)
        double tradePrice = 2450.75;

        // Calculate funds obligation for clearing
        // Obligation = Quantity × Trade Price
        double obligationAmount = quantity * tradePrice;

        // Print trade details for verification/logging
        System.out.println("Trade ID: " + tradeId);
        System.out.println("Client Code: " + clientCode);
        System.out.println("ISIN: " + isin);
        System.out.println("Quantity: " + quantity);
        System.out.println("Trade Price: " + tradePrice);
        System.out.println("Funds Obligation: " + obligationAmount);
    }
}
