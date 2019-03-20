package com.wangyong.myRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by gervard on 2019/3/20.
 * 自定义负载均衡算法
 */
public class RoundRobinRule_wy extends AbstractLoadBalancerRule {

    private  int currentServerInex =0;//当前服务索引
    private  int cycle_count =0; //循环次数

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }

        Server server = null;

        while (server == null ) {
            List<Server> reachableServers = lb.getReachableServers();
            List<Server> allServers = lb.getAllServers();
            int upCount = reachableServers.size();
            int serverCount = allServers.size();

            if ((upCount == 0) || (serverCount == 0)) {
                return null;
            }
           if(currentServerInex>=upCount){
               currentServerInex =0;
           }
           if(cycle_count<5){
               server = reachableServers.get(currentServerInex);
               cycle_count ++;
           }else{
               cycle_count = 0;
               currentServerInex ++;
           }
        }

        return server;
    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }
}
