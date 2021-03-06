package org.thebreak.roombooking.app.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.thebreak.roombooking.app.model.BookingTimeRange;
import org.thebreak.roombooking.app.model.Room;

import java.util.List;


@ToString
@NoArgsConstructor
@Data
@AllArgsConstructor
public class RoomWithBookedTimeVO extends Room {
    @Schema(example = "[{\"start\":\"2021-08-22T22:00\",\n" +
            "        \"end\":\"2021-08-22T23:00\"}]")
    private List<BookingTimeRange> bookedTime;
}
