package com.nakru03.spring.springboot.dto;
import com.nakru03.spring.springboot.web.dto.HelloResponseDto;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_functional_test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
