(def company {:Name "Google"
              :address {:country "USA"
                        :city "Mountain View"
                        :state "California"}})
(get-in company [:address :city])