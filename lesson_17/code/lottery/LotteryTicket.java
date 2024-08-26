package lottery;

import java.util.Random;

public class LotteryTicket {

    private int[] ticketNumbers;

    public int[] getTicketNumbers() {  //предоставили доступ пользователю
        return ticketNumbers;
    }

    public void createTicket(int ticketSize) {   //создаем билет
        ticketNumbers = new int[ticketSize];
    }

    public void fillTicket(int sizeLotteryNumbers) {
        // Math.random() - возвращает псевдослучайное значение от 1 до 1 (не включая)
        Random random = new Random();
        for (int i = 0; i < ticketNumbers.length; i++) {
            boolean isNotFillCurrentPosition = true;

            while (isNotFillCurrentPosition) {
                int randomNumber = random.nextInt(sizeLotteryNumbers) + 1;

                //нам нужно пройти в цикле от начала массива чисел до текущего элемента
                //и проверить выпадал ли этот randomNumber уже
                //если "да" - то получить новый
                //если "нет" - то положить в массив

                if (isRandomNumberNotExist(randomNumber, i)) {
                    ticketNumbers[i] = randomNumber;
                    isNotFillCurrentPosition = false;
                }


            }
        }
    }

    private boolean isRandomNumberNotExist(int checkNumber, int currentPosition) {
        for (int j = 0; j < currentPosition; j++) {
            if (ticketNumbers[j] == checkNumber) {
                return false;
            }
        }
        return true;
    }
}
