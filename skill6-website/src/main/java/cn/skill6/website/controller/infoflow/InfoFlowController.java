package cn.skill6.website.controller.infoflow;

import cn.skill6.common.entity.vo.ResponseJson;
import cn.skill6.website.infoflow.InfoFlowSvc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 信息流
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-04 23:15
 */
@Slf4j
@RestController
@RequestMapping("/infoflow")
public class InfoFlowController {

    @Autowired
    private InfoFlowSvc infoFlowSvc;

    @GetMapping("/latest-update")
    public ResponseJson getLatestUpdate() {
        return infoFlowSvc.getLatestUpdate();
    }

    @GetMapping("/most-browse")
    public ResponseJson getMostBrowse() {
        return infoFlowSvc.getMostBrowse();
    }

    @GetMapping("/most-reply")
    public ResponseJson getMostReply() {
        return infoFlowSvc.getMostReply();
    }

}
