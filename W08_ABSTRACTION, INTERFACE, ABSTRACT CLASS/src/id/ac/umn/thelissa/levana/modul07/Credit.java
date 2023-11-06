package id.ac.umn.thelissa.levana.modul07;

public class Credit extends Payment {
    private int installment;
    private int maxInstallmentAmount;

    public Credit(Item item, int maxInstallmentAmount) {
        super(item);
        this.maxInstallmentAmount = maxInstallmentAmount;
        this.installment = 0;
    }

    @Override
    public int pay() {
        if (isPaidOff) {
            return 0;
        }

        int installmentAmount = item.getPrice() / maxInstallmentAmount;
        if (installment < maxInstallmentAmount) {
            installment++;
            if (installment == maxInstallmentAmount) {
                isPaidOff = true;
            }
            return installmentAmount;
        } else {
            return 0;
        }
    }

    @Override
    public int getRemainingAmount() {
        if (isPaidOff) {
            return 0;
        } else {
            int remainingInstallments = maxInstallmentAmount - installment;
            return remainingInstallments * (item.getPrice() / maxInstallmentAmount);
        }
    }

    @Override
    public String getClassName() {
        return "CREDIT";
    }
}
