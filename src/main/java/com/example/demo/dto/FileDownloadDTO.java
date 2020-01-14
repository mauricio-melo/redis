/*
 * Copyright 2018 Rede S.A.
 *************************************************************
 * Descrição: FileDownloadDTO
 * Autor    : Jacques Freire <jacques.freire@iteris.com.br>
 * Data     : 10/09/2018
 * Empresa  : Iteris
 */

package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileDownloadDTO implements Serializable {


    private UUID id;
    private String fileName;
    private String errorMessage;
    private Long lineCount = 0L;
    private Long estimatedLines = 0L;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Duration duration;
    private Duration timeRemaining;
    private String url;

    @JsonIgnore
    private String token;

    @JsonIgnore
    private String user;

    /**
     * Instantiates a new file download DTO
     */
    public FileDownloadDTO() { }
}