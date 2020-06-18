package com.demo.asd.api.controller.forTest;

import com.demo.asd.dataResult.DataResult;
import com.demo.asd.dataResult.DataResults;
import com.demo.asd.service.bizs.staff.StaffBiz;
import com.demo.asd.service.bizs.test.TestBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Validated
@RestController
@RequestMapping(value="/v1/testApi")
public class DevelopmentTestController {
    @Autowired
    public TestBiz testBiz;

    @Autowired
    public StaffBiz staffBiz;
    @PostMapping("/test1")
    public DataResult<String> msgSendForTest()
    {
        String s1="helloWorld";
        return DataResults.ok(s1);
    }

    @PostMapping("/testConnectMysql")
    public DataResult<String> testConnectMysql()
    {
        String s1=testBiz.testConnectSQL();
        return DataResults.ok(s1);
    }
    //                nHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHn.
//             .MS?MMMMMMMMMMMMMMMMMM?MM~MMMMMMMMMSHMMMMMMMM(?"~\
//             MMMMMH?MMMMMMMX*MM?MMX%MM/MMMMMM"HMMMMMMMMMMMMMMH
//            MMMMMMMMMMMMMMMMMX*MX*MMMX?MMMMM(M!XMMMMMMMMMMMMMMMX
//           XMC)?MMMMMMMMMMMMMMMhX?!?MMMMX#MM!MXMMMMMMMMMMMML   '~
//   '\      MMMMMMMMMMMMMMMMMMMMMMMM!~`````-`~!?MMMM)MMMMMMMMx
//      `~""MMM)MMMMMMMMMMMMMMMHhHH!~           `#MM(MMMMMMMMMM>
//         HM!HMMMMMMMMMMMMMMMM*?)?`                `"MMMMMMMMMX       .
//        XM!MMMMMMMMMMMMMMMMMMM?~                     'MMMMMMMM:..xx!`
//        M!MMMMMMMMMMMMMMMMMXH!                        MMMMXMMP"`
//       \!MMMMMMMSMHHHMM?XMM?~    -:::xx..             M?XMM?".x(
//       MXMMMMMMMMMM!XHMMMM":       ... `"%x          XHHHMMM*"
//      \!MMMMMMMM?XMMMMMMX!'~L     '%%%+:.  `       ..MMMMM"
//      'HMMMMMM?HMMMMM*XM!    h     ~\).^\~     .%""`MM?"
//      'MMMMMMMMMMMMMXMMM!    -X               +%%!.MMMXk
//      ?MMMMMMMMMMMXMMMMM `.   ~               `""'XMMMMX
//      !MMMMMMMMMMMMMMMMMX.    '                  XMkMMX>
//      XMMMMMMMMMMMMMMM?MXXXx.-`                  XXMMM!
//      MMMMMMMMMMMMMMMMXMXXXXXXx.         ~~      MMMMM
//      XMMMMMMMMMMMM?MMXXXXXXXXX!`         '+^  .MMM!P
//      'MMM!MMMMMMMMMi?M!"`        `~%HHHHxx.  xMMMM"
//      :MMMMMMMMMMMMMMM"               `\XMM .MMMMM
//      XMMMMMMMMMX?MM!                   `( HMMMMM
//     XMMMM)MMM"   \~                     'MMMMM*
//    'MMMMfMMM"  \~                        XMMM*
//   .MMMMMXMM"  ^                          `MMM
//   XMMMM!MM"                               MM>
//   HMMMMXM~                                MM>
//   ?MMMMM~                                 Xf%
//    MMMMf                                  %% \
//    4MMM                                    %
//      `M                                     %
//        %                                    %
//        %                                     %
//        %                 !                   %
//         %                 !                   %
//         %                 %                   !?%.
//         %                  %                   X. %%.
//          %                  %                  X!    %%.
//          %                  %                  '!       %.
//           %                  %                  !!         %.
//           %                  %                  '!          `%
//            %                  %                  !>          /%
//            %                   %                 !!          % %
//             %                   %                 !          \%
//             %                   %                 !!          %
//              %                   %                '!         %~
//               %                   %                !!       %~
//               %%                  %                `!     %%
//               %%%                  %                %++4MMf
//                ?MMx                 %                %. MMX
//                 *MMMx               %                 !\'MMM>
//                  MMMMMHx    .....xxnH                  %HMMM>
//                   MMMMMMMMMMMMMMMMMMM>                  MMMMX
//                   'MMMMMMMMMMMMMMMMMMk                  'MMMM
//                    'MMMMMMMMMMMMMMMMMM                   MMMM>
//                     ?MMMMMMMMMMMMMMMMMM                  'MMMX
//                      MMMMMMMMMMMMMMMMMMM                  MMMM
//                      XMMMMM

}
