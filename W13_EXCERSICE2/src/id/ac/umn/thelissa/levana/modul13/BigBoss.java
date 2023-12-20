package id.ac.umn.thelissa.levana.modul13;

public class BigBoss {
    private int hitPoint = 1000;
    private int damageReduction = 10;
    private int damageTaken;
    private BattleLog report;

    public void registerBattleLog(BattleLog report) {
        this.report = report;
    }

    public void onDamageApplied(Player player) {
        damageTaken = player.getDamage() - damageReduction;
        hitPoint -= damageTaken;
        if (hitPoint > 0) {
            report.playerHitBack(player, damageReduction);
            report.reportBattle(player, damageTaken, hitPoint);
        }
        if (hitPoint <= 0) {
            report.reportBattle(player, damageTaken, hitPoint);
            System.out.println("Boss is defeated");
        }
    }
}
