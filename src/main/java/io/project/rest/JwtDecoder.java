import java.util.Base64;

public class JwtDecoder {
    public static void main(String[] args) {
        String jwt = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTdlMWEzMi00MjdiLTRlZWItYjJlZi0wY2NiYjc1NmYwMDIiLCJleHAiOjE3MjE1NDk1ODh9.DocOZcStuRRJqBWr26MhxLf_abU4cy7IrIjq12Ilbn0";
        String[] parts = jwt.split("\\.");

        // 페이로드 부분을 디코딩
        String payload = parts[1];
        String decodedPayload = new String(Base64.getUrlDecoder().decode(payload));

        System.out.println("Decoded Payload: " + decodedPayload);
    }
}
