package br.com.microservices.orchestrated.orchestratorservice.core.data.dto;

import br.com.microservices.orchestrated.orchestratorservice.core.enums.EEventSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class History {

    private EEventSource source;
    private String status;
    private String message;
    private LocalDateTime createdAt;
}
