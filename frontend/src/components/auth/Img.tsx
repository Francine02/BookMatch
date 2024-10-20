interface Animate{
    animate: string;
}

export default function Img({animate} : Animate) {
    return (
        <>
            <img
                src="/assets/books.jpg"
                alt="Imagem com vários livros"
                className={`object-cover w-full h-28 sm:h-full overflow-hidden block ${animate}`} />
        </>
    )
}