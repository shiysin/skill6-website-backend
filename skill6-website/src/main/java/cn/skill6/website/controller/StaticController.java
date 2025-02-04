package cn.skill6.website.controller;

import cn.skill6.common.controller.BaseController;
import cn.skill6.common.utility.RequestParser;
import cn.skill6.website.security.filter.Skill6AuthenticationFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController extends BaseController {

    @GetMapping({"/", "/topic", "/qa", "/code", "/project", "/source", "/talk", "/developing", "/topic/*",
        "/qa/*", "/code/*", "/project/*", "/source/*", "/talk/*", "/developing/*", "/topic/*/*", "/blog/editor"})
    public String index() {
        return "/index.html";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        saveRefererPage();
        return "/index.html";
    }

    /**
     * 保存请求源地址URL
     */
    private void saveRefererPage() {
        String refererUrl = request.getHeader("referer");
        if (StringUtils.isEmpty(refererUrl)) {
            return;
        }

        String requestContext = RequestParser.parseContextIndex(request).toString();
        String refererUri = refererUrl.replaceFirst(requestContext, "");

        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute(Skill6AuthenticationFilter.REFERER_URI_KEY, refererUri);
    }
}
