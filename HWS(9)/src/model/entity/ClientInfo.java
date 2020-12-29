package model.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ClientInfo {
    private String originCard,destinationCard,amount;


    public String getOriginCard() {
        return originCard;
    }

    public ClientInfo setOriginCard(String originCard) {
        this.originCard = originCard;
        return this;
    }

    public String getDestinationCard() {
        return destinationCard;
    }

    public ClientInfo setDestinationCard(String destinationCard) {
        this.destinationCard = destinationCard;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public ClientInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getTime(){
        LocalDateTime time = LocalDateTime.now();
        return time.toString();

    }
    public String getTransactionCode(){
        int begin = 48;
        int end = 57;
        int codeLength = 2;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(codeLength);
        for (int i = 0; i < codeLength; i++) {
            int randomLimitedInt = begin + (int)
                    (random.nextFloat() * (end - begin + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();

    }
}
