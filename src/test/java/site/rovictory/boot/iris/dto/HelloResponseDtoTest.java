package site.rovictory.boot.iris.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import site.rovictory.boot.iris.web.dto.HelloResponseDto;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
