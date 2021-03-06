package org.thebreak.roombooking.payment.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(value = "payment")
@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Payment extends BaseEntity {

    @Field("bookingId")
    private String bookingId;

    @Field("amount")
    private int amount;

    @Field("transId")
    private String transId;

    @Field("type")
    @Schema(description = "int, 1 - room booking, 2 - event booking")
    private int type;

}
