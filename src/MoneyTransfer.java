public class MoneyTransfer {
    public static void main(String[] args) {

        int account = 2_000_000_000; // текущий баланс счёта клиента
        System.out.println("Account: " + account);
        int transfer = 500_000_000; // сумма перевода
        System.out.println("Transfer: " + transfer);
        account = account + transfer;
        System.out.println("Total: " + account); // Состояние счёта после перевода

       // Ниже код программы с новым типом данных
        //float account = 2_000_000_000F; // текущий баланс счёта клиента
        //System.out.println("Account: " + String.format("%.2f", account));
       // float transfer = 500_000_000F; // сумма перевода
        //System.out.println("Transfer: " + String.format("%.2f", transfer));
        //System.out.println("Total: " + String.format("%.2f", account + transfer)); // Состояние счёта после перевода
    }
}
