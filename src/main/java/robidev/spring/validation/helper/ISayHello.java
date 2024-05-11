package robidev.spring.validation.helper;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Validated
public interface ISayHello {
    String sayHello(@NotBlank String name);
}
