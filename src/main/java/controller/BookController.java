package controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBASE.model.Book;
import com.MBASE.services.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	@Autowired
	BookService bks;
	
	@RequestMapping("/create")
	public String create(@Valid @RequestBody Book b) {
		Book bk = bks.create(b);
		return bk.tosString();
	}
	
	@RequestMapping("/{bookCode}")
	public Book getBook(@PathVariable(value = "bookCode") int bookCode) {
		return bks.getBook(bookCode);		
	}
	
	
	@RequestMapping("/update")
	public String update(@Valid @RequestBody Book bk) {
		Book p = bks.update(bk);
		return p.tosString();
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll(){
		bks.deleteAll();
		return "Deleted all book records";
	}

}
