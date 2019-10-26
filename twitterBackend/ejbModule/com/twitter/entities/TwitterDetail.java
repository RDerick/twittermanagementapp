package com.twitter.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the twitter_details database table.
 * 
 */
@Entity
@Table(name="twitter_details")
@NamedQueries({
	@NamedQuery(name="TwitterDetail.findAll", query="SELECT t FROM TwitterDetail t"),
	@NamedQuery(name="TwitterDetail.findAllById", query="SELECT t FROM TwitterDetail t where t.tweetID = :tweetID")
})
public class TwitterDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tweet_ID")
	private Integer tweetID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="time_stamp")
	private Date timeStamp;

	@Column(name="tweet_body")
	private String tweetBody;

	public TwitterDetail() {
	}

	public Integer getTweetID() {
		return tweetID;
	}

	public void setTweetID(Integer tweetID) {
		this.tweetID = tweetID;
	}



	public Date getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTweetBody() {
		return this.tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}

}