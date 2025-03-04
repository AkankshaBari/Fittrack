package com.fittrack.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString(callSuper = true, exclude = "member")
@NoArgsConstructor
@Table(name = "memberFeedbacks")
public class MemberFeedback  extends BaseEntity{

	@Column(length = 200)
	private String description;
	
	private double ratings;
	
	@Column(name =  "email",length = 30)
	private String email;
	@Column(name =  "member_name",length = 30)
	private String memberName;

	@ManyToOne
        @JoinColumn(name = "member_id", nullable = false)
        private Member member;
	
	public MemberFeedback(String description, double ratings, String email, String memberName) {
		super();
		this.description = description;
		this.ratings = ratings;
		this.email = email;
		this.memberName = memberName;
	}

	
	
	
	
}
