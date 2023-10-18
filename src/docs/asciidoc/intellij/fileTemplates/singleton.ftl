/**
* Singleton statique synchronisé
*
* @param<T> Le type du singleton
    */
    public abstract class Singleton<T> {

        private static T instance;

        protected Singleton() {
        }

        public static T getInstance() {
        if (instance == null) {
        synchronized (Singleton.class) {
        if (instance == null) {
        instance = createInstance();
        }
        }
        }
        return instance;
        }

        protected abstract T createInstance();
        }
