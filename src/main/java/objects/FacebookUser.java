package objects;

public class FacebookUser {
   String username;
   String password;
   String firsName;
   String lastName;
   public void login (String username, String password){
      System.out.println(username+" logged in");

   }

   public static void main(String[] args) {
      FacebookUser user = new FacebookUser();
      user.login("Kefteme","BarhotnyeTyagi");
      user.username = "Tokyo";
      user.password = "Kefteme";
      FacebookUser user2 =new FacebookUser();
      user2.username = "Keftame";
      user2.password = "Barhot";
   }
}
