# helloworld

## Versions

* Leiningen: 2.3.3
* OpenJDK: 1.7.0 64bit

## Run server on local development environment

```sh
lein repl
# > (require 'helloworld.core)
# > (helloworld.core/-main 5000)

# or

lein run -m helloworld.core 5000

# or

lein uberjar
java -cp target/helloworld-standalone.jar clojure.main -m helloworld.core 5000
```

## Deploy to Heroku

```sh
heroku apps:create [app-name]
git push heroku master
#heroku open
```

## References

* [Getting Started with Clojure on Heroku | Heroku Dev Center](https://devcenter.heroku.com/articles/getting-started-with-clojure)

## License

[MIT](http://opensource.org/licenses/MIT)
