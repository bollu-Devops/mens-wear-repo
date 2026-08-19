package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String home(Model model) {

        List<Product> products = new ArrayList<>();

        products.add(
                new Product(
                        "Classic White Shirt",
                        "Shirts",
                        "₹1,299",
                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
                )
        );

        products.add(
                new Product(
                        "Black Casual T-Shirt",
                        "T-Shirts",
                        "₹699",
                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
                )
        );

        products.add(
                new Product(
                        "Slim Fit Jeans",
                        "Jeans",
                        "₹1,999",
                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
                )
        );

        products.add(
                new Product(
                        "Denim Jacket",
                        "Jackets",
                        "₹2,499",
                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
                )
        );

        model.addAttribute("products", products);

        return "index";
    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}package com.menswear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

	    @GetMapping("/")
	        public String home(Model model) {

			        List<Product> products = new ArrayList<>();

				        products.add(
							                new Product(
										                        "Classic White Shirt",
													                        "Shirts",
																                        "₹1,299",
																			                        "https://images.unsplash.com/photo-1603252110481-7ba873bf42ab"
																						                )
									        );

					        products.add(
								                new Product(
											                        "Black Casual T-Shirt",
														                        "T-Shirts",
																	                        "₹699",
																				                        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
																							                )
										        );

						        products.add(
									                new Product(
												                        "Slim Fit Jeans",
															                        "Jeans",
																		                        "₹1,999",
																					                        "https://images.unsplash.com/photo-1542272604-787c3835535d"
																								                )
											        );

							        products.add(
										                new Product(
													                        "Denim Jacket",
																                        "Jackets",
																			                        "₹2,499",
																						                        "https://images.unsplash.com/photo-1551028719-00167b16eac5"
																									                )
												        );

								        model.addAttribute("products", products);

									        return "index";
										    }
}
