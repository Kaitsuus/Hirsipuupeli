
public class Henkilo {
    private String vaaraVastaus1;
    private String vaaraVastaus2;
    private String vaaraVastaus3;
    private String vaaraVastaus4;
    private String vaaraVastaus5;
    private String oikein;
    public Henkilo() {
      
    }
    public String vaara1() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("___|___");
        return this.vaaraVastaus1;
    }
    public String vaara2() {
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
        return this.vaaraVastaus2;
    }
    public String vaara3() {
        System.out.println("    ______");
        System.out.println("   |      |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
        return this.vaaraVastaus3;
    }
    public String vaara4() {
        System.out.println("    ______");
        System.out.println("   |      |");
        System.out.println("   |     ( )");
        System.out.println("   |     -|-");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
        return this.vaaraVastaus4;
    }
    public String vaara5() {
        System.out.println("    ______");
        System.out.println("   |      |");
        System.out.println("   |     ( )");
        System.out.println("   |     -|-");
        System.out.println("   |     _|_");
        System.out.println("   |  GAME OVER");
        System.out.println("___|___");
        return this.vaaraVastaus5;
    }
    public String oikein() {
        System.out.println("***********");
        System.out.println("*         *");
        System.out.println("* Oikein! *");
        System.out.println("*         *");
        System.out.println("***********");
        return this.oikein;
    }
}
