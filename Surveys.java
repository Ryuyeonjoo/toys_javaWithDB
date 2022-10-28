import java.sql.Statement;

public class Surveys {
    public void Survey(Statement statement){
    //설문 시작
    System.out.println("설문시작");
    //이름과 휴대폰 입력 확인
    System.out.println("이름 :");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("휴대폰 번호 :");
    String phone_number = scanner.next();

    String query = "INSERT INTO users_list(USERS_UID, PHONE, NAME)" + 
        "VALUES('U1', '"+phone_number+"', '"+name+"')";

        try {
            statement.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}