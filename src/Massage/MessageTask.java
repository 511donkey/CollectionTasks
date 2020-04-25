package Massage;

import javafx.scene.layout.Priority;

import java.util.*;

public class MessageTask {


    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        List<Message> messageListLOW = new ArrayList<>();
        List<Message> messageListHIGH = new ArrayList<>();
        List<Message> messageListMEDIUM = new ArrayList<>();
        List<Message> messageListURGENT = new ArrayList<>();
        for (Message msg: messageList) {
            if(msg.getPriority() == MessagePriority.LOW){
               messageListLOW.add(msg);
            } else if(msg.getPriority() == MessagePriority.HIGH){
                messageListHIGH.add(msg);
            } else if(msg.getPriority() == MessagePriority.MEDIUM){
                messageListMEDIUM.add(msg);
            } else if(msg.getPriority() == MessagePriority.URGENT){
                messageListURGENT.add(msg);
            }
        }
        System.out.println("количество сообщений для приоритета LOW - " + messageListLOW.size()
        + ", количество сообщений для приоритета HIGH - " + messageListHIGH.size()
        + ", количество сообщений для приоритета MEDIUM - " + messageListMEDIUM.size()
        + ", количество сообщений для приоритета URGENT - " + messageListURGENT.size() + "\n");
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        List<Message> messageList0 = new ArrayList<>();
        List<Message> messageList1 = new ArrayList<>();
        List<Message> messageList2 = new ArrayList<>();
        List<Message> messageList3 = new ArrayList<>();
        List<Message> messageList4 = new ArrayList<>();
        List<Message> messageList5 = new ArrayList<>();
        List<Message> messageList6 = new ArrayList<>();
        List<Message> messageList7 = new ArrayList<>();
        List<Message> messageList8 = new ArrayList<>();
        List<Message> messageList9 = new ArrayList<>();

        for (Message msg: messageList) {
            if(msg.getCode() == 0){
                messageList0.add(msg);
            }
            if(msg.getCode() == 1){
                messageList1.add(msg);
            }
            if(msg.getCode() == 2){
                messageList2.add(msg);
            }
            if(msg.getCode() == 3){
                messageList3.add(msg);
            }
            if(msg.getCode() == 4){
                messageList4.add(msg);
            }
            if(msg.getCode() == 5){
                messageList5.add(msg);
            }
            if(msg.getCode() == 6){
                messageList6.add(msg);
            }
            if(msg.getCode() == 7){
                messageList7.add(msg);
            }
            if(msg.getCode() == 8){
                messageList8.add(msg);
            }
            if(msg.getCode() == 9){
                messageList9.add(msg);
            }
        }

        System.out.println("количество сообщений для кода 0 - " + messageList0.size() + "\n"
        + "количество сообщений для кода 1 - " + messageList1.size() + "\n"
        + "количество сообщений для кода 2 - " + messageList2.size() + "\n"
                +  "количество сообщений для кода 3 - " + messageList3.size() + "\n"
         +  "количество сообщений для кода 4 - " + messageList4.size() + "\n"
        + "количество сообщений для кода 5 - " + messageList5.size() + "\n"
        + "количество сообщений для кода 6 - " + messageList6.size() + "\n"
        + "количество сообщений для кода 7 - " + messageList7.size() + "\n"
        + "количество сообщений для кода 8 - " + messageList8.size() + "\n"
        + "количество сообщений для кода 9 - " + messageList9.size() + "\n" );

    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        HashSet<Message> uniqueMessageList = new HashSet<>(messageList);
        System.out.println("количество уникальных сообщений - " + uniqueMessageList.size());

    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet<Message> uniqueInOrderMessage = new LinkedHashSet<>(messageList);
        System.out.println("неповторяющиеся сообщения в том порядке, в котором они встретились в первоначальном списке - "+ "\n"
                + uniqueInOrderMessage + "\n");
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления: " + "\n" + messageList);
        List<Message> messageListLOW = new ArrayList<>();
        List<Message> messageListHIGH = new ArrayList<>();
        List<Message> messageListMEDIUM = new ArrayList<>();
        List<Message> messageListURGENT = new ArrayList<>();

        for (Message msg: messageList) {
            if(msg.getPriority() == MessagePriority.LOW){
                messageListLOW.add(msg);
            } else if(msg.getPriority() == MessagePriority.HIGH){
                messageListHIGH.add(msg);
            } else if(msg.getPriority() == MessagePriority.MEDIUM){
                messageListMEDIUM.add(msg);
            } else if(msg.getPriority() == MessagePriority.URGENT){
                messageListURGENT.add(msg);
            }
        }

        switch (priority){
            case LOW: messageList.removeAll(messageListLOW);
            break;
            case HIGH: messageList.removeAll(messageListHIGH);
            break;
            case MEDIUM: messageList.removeAll(messageListMEDIUM);
            break;
            case URGENT: messageList.removeAll(messageListURGENT);
            break;
        }

        System.out.println("после удаления: " + "\n" + messageList + "\n");

    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления: " + "\n" + messageList);
        List<Message> messageListLOW = new ArrayList<>();
        List<Message> messageListHIGH = new ArrayList<>();
        List<Message> messageListMEDIUM = new ArrayList<>();
        List<Message> messageListURGENT = new ArrayList<>();

        for (Message msg: messageList) {
            if (msg.getPriority() == MessagePriority.LOW) {
                messageListLOW.add(msg);
            } else if (msg.getPriority() == MessagePriority.HIGH) {
                messageListHIGH.add(msg);
            } else if (msg.getPriority() == MessagePriority.MEDIUM) {
                messageListMEDIUM.add(msg);
            } else if (msg.getPriority() == MessagePriority.URGENT) {
                messageListURGENT.add(msg);
            }
        }

        switch (priority){
            case LOW: messageList.retainAll(messageListLOW);
            break;
            case HIGH: messageList.retainAll(messageListHIGH);
            break;
            case MEDIUM: messageList.retainAll(messageListMEDIUM);
            break;
            case URGENT: messageList.retainAll(messageListURGENT);
            break;
        }

        System.out.println("после удаления: " + "\n" + messageList);

    }

    public static void main(String[] args) {
        // вызов методоd

        List<Message> messageList = MessageGenerator.generate(10);
        System.out.println(messageList);
        countEachPriority(messageList);
        countEachCode(messageList);
        uniqueMessageCount(messageList);
        uniqueMessagesInOriginalOrder(messageList);
        removeEach(messageList, MessagePriority.LOW);
        removeOther(messageList, MessagePriority.HIGH);
    }
}
