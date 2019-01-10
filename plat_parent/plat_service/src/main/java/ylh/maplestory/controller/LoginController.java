package ylh.maplestory.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ylh.maplestore.util.AjaxResult;
import ylh.maplestory.Employee;

@RestController
public class LoginController {
//    value = "/login" :路径
//    method = RequestMethod.POST：post提交方式
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("woaichipg".equals(employee.getName())&&"pg".equals(employee.getPassword())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("失败");
    }
}
