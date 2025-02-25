package springmvcsearch;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		String str = null;
		System.out.println(str.charAt(0));
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") MultipartFile file, Model model) {
		String msg= "";
	    if(!file.isEmpty()) {
	      BufferedOutputStream bos =null;
	      try {
	        byte[] fileBytes = file.getBytes();
	        // location to save the file
	        String fileName = "G:\\Test\\"+file.getOriginalFilename();
	        bos = new BufferedOutputStream(new FileOutputStream(new File(fileName)));
	        bos.write(fileBytes);
	        msg = "Upload successful for " + file.getName();
	      } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }finally {
	        if(bos != null) {
	          try {
	            bos.close();
	          } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	          }
	        }
	      }
	    }else {
	      msg = "Upload failed for " + file.getName() + " as file is empty";
	    }
		model.addAttribute("file",file);
		model.addAttribute("msg",msg);
		return "filesuccess";
	}
	
}
