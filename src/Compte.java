public class Compte extends Client{
    private int numeroCompte;
    private int solde ;
    private int virement;
    private int retrait;
    private int encaisser;
    private String beneficiaire;

    public Compte (int idCompte, int montant){
        //permet de dire que ces l'information de Client (super)
        super(idCompte);
        this.solde = montant;

    }

    public double getSolde() {
        //Affichage du solde
        return solde;
    }
     public void setVirement (int montant, String newpersonne ){
        //Faire un virement
        System.out.println("Quelle est le montant de votre virement \nLe montant doit avoir ce format 00.00 ");
        //Verification que le soldes est suffissant
        if(this.solde < montant){
            System.out.println("Votre soldes n'est pas suffisant \nMerci de rentrer un montant inférieur a "+this.solde);
        }else{
            solde=solde-montant;
            beneficiaire = newpersonne;
        }

     }
     public int getVirement ( ){
        System.out.println("Vous avez fait un virement a "+beneficiaire);
        return this.solde;

     }

    public void setRetrait(int retrait) {
        System.out.println("Combien voulez vous retirer? ");
        if(this.solde < retrait){
            System.out.println("Votre soldes n'est pas suffisant \nMerci de rentrer un montant inférieur a "+this.solde);
        }else{
            solde=solde-retrait;
        }
    }

    public int getRetrait() {
        System.out.println("Vous avez retirer " + retrait);
        System.out.println("Il vous reste :" );
        return solde;

    }

    public void setEncaisser(int encaisser) {
        System.out.println("Quelle est le montant que vous avez encaisser ?");

        solde=solde+encaisser;

    }

    public int getEncaisser() {
        System.out.println("Vous avez reçu " + encaisser);
        System.out.println("Vous avez donc un solde de  :" );
        return solde;
    }
}

