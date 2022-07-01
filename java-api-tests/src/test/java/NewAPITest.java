import static io.restassured.RestAssured.given;

public class NewAPITest {
    public static void main(String[] args) {
        getUserProfile();
    }

    public static void getUserProfile() {
        given().when().get("https://api.realworld.io/api/profiles/testUser001").then().assertThat().statusCode(200).log().all();
    }
}
