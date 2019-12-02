package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
	@JsonProperty("image")
	String image;
	@JsonProperty("value")
	String value;
	@JsonProperty("suit")
	String suit;
	@JsonProperty("code")
	String code;

	public Card() {
	}

	public Card(String image, String value, String suit, String code) {
		super();
		this.image = image;
		this.value = value;
		this.suit = suit;
		this.code = code;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Card [image=" + image + ", value=" + value + ", suit=" + suit + ", code=" + code + "]";
	}

}
