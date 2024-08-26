package lottery;

import java.util.Arrays;

public class LotteryResult {

    public void checkLotteryResult(Lottery lottery, Player player){
        //проводим проверку выйгрышных номеров и сравниваем их с номерами в билетах игрока

        //узнать выйгрышные номера лотереи

        int[] winnerNumber = lottery.getWinnerNumbers();

        Arrays.sort(winnerNumber);

        //получить билеты от игрока

        LotteryTicket[] tickets = player.getTickets();
        System.out.println("Результат проверки для игрока: " + player.getIdCode());

        //проводим проверку для КАЖДОГО ИГРОКА

        for (int i=0; i< tickets.length; i++){
            //получаем номера из текущего билета

            int[] numbersFromCurrentTicket = tickets[i].getTicketNumbers();

            //сравним и посчитаем количество совпадений

            int mathCounter = 0;

            for (int j = 0; j < numbersFromCurrentTicket.length; j++){
                if (Arrays.binarySearch(winnerNumber,numbersFromCurrentTicket[i])>0){
                    mathCounter++;
                }
            }
            System.out.println("Ticket # " + (i +1) + " has " + mathCounter + " winner numbers ");

        }
    }
}
