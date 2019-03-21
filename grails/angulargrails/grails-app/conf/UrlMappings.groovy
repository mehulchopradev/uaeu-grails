class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

				"/playnames" (controller: "home", action: "index")

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
