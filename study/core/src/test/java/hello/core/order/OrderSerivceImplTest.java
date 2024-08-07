package hello.core.order;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderSerivceImplTest {

    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));

        OrderSerivceImpl orderSerivce = new OrderSerivceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderSerivce.createOrder(1L, "item", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}