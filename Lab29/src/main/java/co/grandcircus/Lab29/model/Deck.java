package co.grandcircus.Lab29.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deck {
	@JsonProperty("success")
	boolean success;
	@JsonProperty("cards")
	ArrayList<Card> cards;
	@JsonProperty("deck_id")
	String deck_id;
	@JsonProperty("remaining")
	int remaining;

	public Deck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deck(boolean success, ArrayList<Card> cards, String deck_id, int remaining) {
		super();
		this.success = success;
		this.cards = cards;
		this.deck_id = deck_id;
		this.remaining = remaining;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public String getDeck_id() {
		return deck_id;
	}

	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}

	public int getRemaining() {
		return remaining;
	}

	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}

	@Override
	public String toString() {
		return "Deck [success=" + success + ", cards=" + cards + ", deck_id=" + deck_id + ", remaining=" + remaining
				+ "]";
	}
}
