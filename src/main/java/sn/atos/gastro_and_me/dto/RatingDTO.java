package sn.atos.gastro_and_me.dto;

public class RatingDTO {
    private Long id;
    private int value;
    private String comment;
    private Long restaurantId;

    public RatingDTO() {
    }

    public RatingDTO(Long id, int value, String comment) {
        this.id = id;
        this.value = value;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
