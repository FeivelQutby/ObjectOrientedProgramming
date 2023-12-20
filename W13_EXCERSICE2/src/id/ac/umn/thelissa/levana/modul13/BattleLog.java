package id.ac.umn.thelissa.levana.modul13;

public class BattleLog {
    public void playerHitBack(Player player, int damageReductionFromBoss){
        int currentHitPoint = player.getHitPoint();
        int newHitPoint = currentHitPoint - damageReductionFromBoss;
        int currentEnergy = player.getEnergy();
        int newEnergy = currentEnergy - player.getDamage();
        player.setEnergy(newEnergy);
        player.setHitPoint(newHitPoint);
    }

    public void reportBattle(Player player, int damageTakenBoss, int hitPointBoss){
        System.out.println("--- Battle Log ---");
        System.out.println("Player               : " + player.getName());
        System.out.println("Damage Given to Boss : " + damageTakenBoss);
        System.out.println("Current Energy       : " + player.getEnergy());
        System.out.println("Current Hitpoint     : " + player.getHitPoint());
        System.out.println("Health Boss          : " + hitPointBoss);
        System.out.println("");
    }
}