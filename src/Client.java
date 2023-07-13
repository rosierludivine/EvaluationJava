public class Client {
     public int idCompte ;
     public String name;
     private String prenom;

     private String ville;

     private int codePostal;

     private int nTelephone;

     public  Client(String nom, String prenom, String ville, int codePostal, int telephone, int idCompte ){
          this.name = nom;
          this.prenom= prenom;
          this.ville= ville;
          this.codePostal = codePostal;
          this.nTelephone= telephone;
          this.idCompte= idCompte;
     }

     public Client(int idCompte) {
     }

     public int getIdCompte(){
          return idCompte;
     }
     public void setIdCompte(int idCompte) {
          this.idCompte = idCompte;
     }

     public String getPrenom() {
          return prenom;
     }

     public void setPrenom(String newPrenom) {
          this.prenom = newPrenom;
     }

     public String getName() {
          return name;
     }

     public void setName(String newName) {
          this.name = newName;
     }

     public String getVille() {
          return ville;
     }


     public int getCodePostal() {
          return codePostal;
     }

     public void setCodePostal(int codePostal) {
          this.codePostal = codePostal;
     }

     public int getnTelephone() {
          return this.nTelephone;
     }

     public void setnTelephone(int nTelephone) {
          this.nTelephone = nTelephone;
     }


}
