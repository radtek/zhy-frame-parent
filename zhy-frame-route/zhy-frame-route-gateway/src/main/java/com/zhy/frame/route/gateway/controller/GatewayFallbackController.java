package com.zhy.frame.route.gateway.controller;


import com.zhy.frame.base.core.exception.BusinessException;
import com.zhy.frame.route.common.exception.RouteException;
import com.zhy.frame.route.gateway.utils.ExceptionUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @describe：
 * @author: lvmoney /xxxx科技有限公司
 * @version:v1.0 2018年9月30日 上午8:51:33
 */
@RestController
public class GatewayFallbackController {
    @RequestMapping("/gateway/fallback/default")
    public Mono<Void> defaultFallback(ServerHttpResponse serverHttpResponse) {
        serverHttpResponse.setStatusCode(HttpStatus.CONFLICT);
        return serverHttpResponse.writeWith(Flux.just(ExceptionUtil.filterExceptionHandle(serverHttpResponse, new BusinessException(RouteException.Proxy.SERVER_IS_DOWNGRADE))));
    }
}
