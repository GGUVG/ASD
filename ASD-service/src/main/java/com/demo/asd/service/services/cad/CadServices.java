package com.demo.asd.service.services.cad;

import org.kabeja.batik.tools.SAXPNGSerializer;
import org.kabeja.dxf.DXFDocument;
import org.kabeja.parser.ParseException;
import org.kabeja.parser.Parser;
import org.kabeja.parser.ParserBuilder;
import org.kabeja.svg.SVGGenerator;
import org.kabeja.xml.SAXGenerator;
import org.kabeja.xml.SAXSerializer;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.HashMap;

/**
 * 对于CAD施工图纸的操作
 * https://blog.csdn.net/IManiy/article/details/86574477
 * sb才不用CAD工具绘图用网页吧...
 */
@Service
public class CadServices
{
    public void transferDwg(File InFile) throws FileNotFoundException, ParseException, SAXException {

        //InputStream in = new FileInputStream("C:/Users/Admin/Desktop/svg/draft.dxf");
        // Parser dxfParser = DXFParserBuilder.createDefaultParser();
        Parser dxfParser = ParserBuilder.createDefaultParser();
        dxfParser.parse(new FileInputStream(InFile), "UTF-8");//需要转换的dxf
        DXFDocument doc = dxfParser.getDocument();
        SAXGenerator generator = new SVGGenerator();

        // generate into outputstream

        // 输出SVG
        //SAXSerializer out = new SAXPDFSerializer();
        // 输出pdf
        // org.kabeja.xml.SAXSerialzer out =
        // org.kabeja.batik.tools.SAXPDFSerializer();
        // 输出tiff
        // org.kabeja.xml.SAXSerialzer out =
        // org.kabeja.batik.tools.SAXTIFFSerializer();
        // 输出png
        SAXSerializer out =new SAXPNGSerializer();
        // 输出jpg
        // org.kabeja.xml.SAXSerialzer out =
        // org.kabeja.batik.tools.SAXJEPGSerializer();

        OutputStream fileo = new FileOutputStream("C:/Users/Admin/Desktop/svg/method-draw-image.png");//转换所得的文件

        // out.setOutputStream(response.getOutputStream()) //write direct to
        // ServletResponse
        out.setOutput(fileo);
        // generate
        generator.generate(doc, out, new HashMap());


    }


}
