package cn.skill6.website.controller.home;

import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.website.home.TopNSvc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * top n 推荐
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-04 22:52
 */
@Slf4j
@RestController
@RequestMapping("/topn")
public class TopNController {

    @Autowired
    private TopNSvc topNSvc;

    @GetMapping("/active-user")
    public ResponseJson getActiveUser() {
        return topNSvc.getActiveUsers();
    }

    @GetMapping("/visit-user")
    public ResponseJson getVisitUser() {
        return topNSvc.getActiveUsers();
    }

    @GetMapping("/publish-article")
    public ResponseJson getPublishArticle() {
        return topNSvc.getPublishArticles();
    }

}
