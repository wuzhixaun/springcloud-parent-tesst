package userdefinerule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud-parent->MySelfRule
 * @description: 自动以负载均衡规则
 * @author: wuzx
 * @create: 2019-08-20 17:29
 * @version: 1.0
 **/

/**
 * 重点；官方文档明确警告：
 *  1、这个自定义配置类不能放在@ComponentScan所扫瞄的当钱包下以及子包下，
 *  否则我们自定义的这个配置类将会被所有的Ribbon客户端所共享，也就是说
 *  我们达不到特殊化定制的目的
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule_ZY();
    }

}
