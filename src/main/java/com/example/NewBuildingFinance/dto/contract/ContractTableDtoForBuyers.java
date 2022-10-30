package com.example.NewBuildingFinance.dto.contract;

import lombok.Data;

@Data
public class ContractTableDtoForBuyers {
    private Long id;
    private Long flatId;
    private Integer flatNumber;
    private Double flatArea;
    private String status;
    private Integer price;
    private String object;
    private String date;
    private String agency;
    private String realtor;
}
